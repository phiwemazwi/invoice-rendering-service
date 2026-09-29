package com.billing.model;

import java.math.BigDecimal;

public class InvoiceSummaryDetail {
    private String invoiceText;
    private BigDecimal amount;

    public String getInvoiceText(){
        return invoiceText;
    }
    public void setInvoiceText(String invoiceText){
        this.invoiceText = invoiceText;
    }

    public BigDecimal getAmount(){
        return amount;
    }
    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }
}
