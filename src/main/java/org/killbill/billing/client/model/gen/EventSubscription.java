/*
 * Kill Bill
 * Kill Bill is an open-source billing and payments platform
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import org.joda.time.LocalDate;
import org.killbill.billing.entitlement.api.SubscriptionEventType;

import java.util.ArrayList;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class EventSubscription extends KillBillObject {

    private UUID eventId = null;

    private String billingPeriod = null;

    private LocalDate effectiveDate = null;

    private String plan = null;

    private String product = null;

    private String priceList = null;

    private SubscriptionEventType eventType = null;

    private Boolean isBlockedBilling = false;

    private Boolean isBlockedEntitlement = false;

    private String serviceName = null;

    private String serviceStateName = null;

    private String phase = null;

    public EventSubscription eventId(UUID eventId) {
        this.eventId = eventId;
        return this;
    }

    
    public UUID getEventId() {
        return eventId;
    }

    public void setEventId(UUID eventId) {
        this.eventId = eventId;
    }

    public EventSubscription billingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
        return this;
    }

    
    public String getBillingPeriod() {
        return billingPeriod;
    }

    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    public EventSubscription effectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    
    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public EventSubscription plan(String plan) {
        this.plan = plan;
        return this;
    }

    
    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public EventSubscription product(String product) {
        this.product = product;
        return this;
    }

    
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public EventSubscription priceList(String priceList) {
        this.priceList = priceList;
        return this;
    }

    
    public String getPriceList() {
        return priceList;
    }

    public void setPriceList(String priceList) {
        this.priceList = priceList;
    }

    public EventSubscription eventType(SubscriptionEventType eventType) {
        this.eventType = eventType;
        return this;
    }

    
    public SubscriptionEventType getEventType() {
        return eventType;
    }

    public void setEventType(SubscriptionEventType eventType) {
        this.eventType = eventType;
    }

    public EventSubscription isBlockedBilling(Boolean isBlockedBilling) {
        this.isBlockedBilling = isBlockedBilling;
        return this;
    }

    
    public Boolean isIsBlockedBilling() {
        return isBlockedBilling;
    }

    public void setIsBlockedBilling(Boolean isBlockedBilling) {
        this.isBlockedBilling = isBlockedBilling;
    }

    public EventSubscription isBlockedEntitlement(Boolean isBlockedEntitlement) {
        this.isBlockedEntitlement = isBlockedEntitlement;
        return this;
    }

    
    public Boolean isIsBlockedEntitlement() {
        return isBlockedEntitlement;
    }

    public void setIsBlockedEntitlement(Boolean isBlockedEntitlement) {
        this.isBlockedEntitlement = isBlockedEntitlement;
    }

    public EventSubscription serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public EventSubscription serviceStateName(String serviceStateName) {
        this.serviceStateName = serviceStateName;
        return this;
    }

    
    public String getServiceStateName() {
        return serviceStateName;
    }

    public void setServiceStateName(String serviceStateName) {
        this.serviceStateName = serviceStateName;
    }

    public EventSubscription phase(String phase) {
        this.phase = phase;
        return this;
    }

    
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventSubscription eventSubscription = (EventSubscription) o;
        return Objects.equals(this.eventId, eventSubscription.eventId) &&
        Objects.equals(this.billingPeriod, eventSubscription.billingPeriod) &&
        Objects.equals(this.effectiveDate, eventSubscription.effectiveDate) &&
        Objects.equals(this.plan, eventSubscription.plan) &&
        Objects.equals(this.product, eventSubscription.product) &&
        Objects.equals(this.priceList, eventSubscription.priceList) &&
        Objects.equals(this.eventType, eventSubscription.eventType) &&
        Objects.equals(this.isBlockedBilling, eventSubscription.isBlockedBilling) &&
        Objects.equals(this.isBlockedEntitlement, eventSubscription.isBlockedEntitlement) &&
        Objects.equals(this.serviceName, eventSubscription.serviceName) &&
        Objects.equals(this.serviceStateName, eventSubscription.serviceStateName) &&
        Objects.equals(this.phase, eventSubscription.phase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, billingPeriod, effectiveDate, plan, product, priceList, eventType, isBlockedBilling, isBlockedEntitlement, serviceName, serviceStateName, phase);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSubscription {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    isBlockedBilling: ").append(toIndentedString(isBlockedBilling)).append("\n");
        sb.append("    isBlockedEntitlement: ").append(toIndentedString(isBlockedEntitlement)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serviceStateName: ").append(toIndentedString(serviceStateName)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
