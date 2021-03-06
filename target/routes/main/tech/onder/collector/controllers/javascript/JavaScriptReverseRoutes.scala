// @GENERATOR:play-routes-compiler
// @SOURCE:C:/work/report-brocker/conf/routes
// @DATE:Mon Dec 17 01:18:26 CET 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:2
package tech.onder.collector.controllers.javascript {

  // @LINE:2
  class ReverseCollectorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def pushList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "tech.onder.collector.controllers.CollectorController.pushList",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/meters/fromlog"})
        }
      """
    )
  
    // @LINE:2
    def push: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "tech.onder.collector.controllers.CollectorController.push",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/meters/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
