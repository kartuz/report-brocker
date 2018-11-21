package tech.onder.reports.actors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.util.Timeout;
import com.typesafe.config.Config;
import play.libs.akka.InjectedActorSupport;

import javax.inject.Inject;
import java.util.Set;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

import static akka.pattern.PatternsCS.ask;
import static akka.pattern.PatternsCS.pipe;

public class UserParentActor extends AbstractActor implements InjectedActorSupport {

    private final Timeout timeout = new Timeout(5, TimeUnit.SECONDS);

    public static class Create {
        final String id;

        public Create(String id) {
            this.id = id;
        }
    }

    private final UserActor.Factory childFactory;

    @Inject
    public UserParentActor(UserActor.Factory childFactory, Config config) {
        this.childFactory = childFactory;

    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(UserParentActor.Create.class, create -> {
                    ActorRef child = injectedChild(() -> childFactory.create(create.id), "userActor-" + create.id);
                    CompletionStage<Object> future = ask(child, "time", timeout);
                    pipe(future, context().dispatcher()).to(sender());
                }).build();
    }

}
