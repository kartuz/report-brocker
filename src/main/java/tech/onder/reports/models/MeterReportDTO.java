package tech.onder.reports.models;


public class MeterReportDTO {

    private String uuid;

    private Long updateTime;

    private String price;

    private String saleKwh;

    private String saleTokens;

    private String purchaseKwh;

    private String purchaseTokens;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSaleKwh() {
        return saleKwh;
    }

    public void setSaleKwh(String saleKwh) {
        this.saleKwh = saleKwh;
    }

    public String getSaleTokens() {
        return saleTokens;
    }

    public void setSaleTokens(String saleTokens) {
        this.saleTokens = saleTokens;
    }

    public String getPurchaseKwh() {
        return purchaseKwh;
    }

    public void setPurchaseKwh(String purchaseKwh) {
        this.purchaseKwh = purchaseKwh;
    }

    public String getPurchaseTokens() {
        return purchaseTokens;
    }

    public void setPurchaseTokens(String purchaseTokens) {
        this.purchaseTokens = purchaseTokens;
    }
}
