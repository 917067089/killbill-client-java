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
import java.math.BigDecimal;
import java.util.UUID;
import org.joda.time.LocalDate;

import java.util.ArrayList;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Credit extends KillBillObject {

    private BigDecimal creditAmount = null;

    private String currency = null;

    private UUID invoiceId = null;

    private String invoiceNumber = null;

    private LocalDate effectiveDate = null;

    private UUID accountId = null;

    private String description = null;

    public Credit creditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Credit currency(String currency) {
        this.currency = currency;
        return this;
    }

    
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Credit invoiceId(UUID invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    
    public UUID getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(UUID invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Credit invoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Credit effectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    
    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Credit accountId(UUID accountId) {
        this.accountId = accountId;
        return this;
    }

    
    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public Credit description(String description) {
        this.description = description;
        return this;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Credit credit = (Credit) o;
        return Objects.equals(this.creditAmount, credit.creditAmount) &&
        Objects.equals(this.currency, credit.currency) &&
        Objects.equals(this.invoiceId, credit.invoiceId) &&
        Objects.equals(this.invoiceNumber, credit.invoiceNumber) &&
        Objects.equals(this.effectiveDate, credit.effectiveDate) &&
        Objects.equals(this.accountId, credit.accountId) &&
        Objects.equals(this.description, credit.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditAmount, currency, invoiceId, invoiceNumber, effectiveDate, accountId, description);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Credit {\n");
        
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
        sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
