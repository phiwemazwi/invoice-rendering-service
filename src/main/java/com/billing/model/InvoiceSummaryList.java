package com.billing.model;

import java.util.List;

public class InvoiceSummaryList {
    private List<InvoiceSummaryDetail> invoiceSummaryDetails;

    public List<InvoiceSummaryDetail> getInvoiceSummaryDetails(){
        return invoiceSummaryDetails;
    }
    public void setInvoiceSummaryDetails(List<InvoiceSummaryDetail> invoiceSummaryDetails){
        this.invoiceSummaryDetails = invoiceSummaryDetails;
    }



}
