package com.autoparts.pricingProducer.model;

/*
Model to construct the pricing record from pricing assignment service
 */
public class PricingRecord {

    private String customerType;
    private String priceType;
    private String pricingHierarchyNodeId;
    private String retailPromoExclusion;
    private String proPromoExclusion;
    private String baseline;
    private String segmentId;
    private String contactName;
    private String tieredDiscountType;
    private String secondSourceMarginRate;

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getPricingHierarchyNodeId() {
        return pricingHierarchyNodeId;
    }

    public void setPricingHierarchyNodeId(String pricingHierarchyNodeId) {
        this.pricingHierarchyNodeId = pricingHierarchyNodeId;
    }

    public String getRetailPromoExclusion() {
        return retailPromoExclusion;
    }

    public void setRetailPromoExclusion(String retailPromoExclusion) {
        this.retailPromoExclusion = retailPromoExclusion;
    }

    public String getProPromoExclusion() {
        return proPromoExclusion;
    }

    public void setProPromoExclusion(String proPromoExclusion) {
        this.proPromoExclusion = proPromoExclusion;
    }

    public String getBaseline() {
        return baseline;
    }

    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getTieredDiscountType() {
        return tieredDiscountType;
    }

    public void setTieredDiscountType(String tieredDiscountType) {
        this.tieredDiscountType = tieredDiscountType;
    }

    public String getSecondSourceMarginRate() {
        return secondSourceMarginRate;
    }

    public void setSecondSourceMarginRate(String secondSourceMarginRate) {
        this.secondSourceMarginRate = secondSourceMarginRate;
    }
}
