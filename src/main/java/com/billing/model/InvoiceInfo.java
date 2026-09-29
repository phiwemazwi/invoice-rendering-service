package com.billing.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InvoiceInfo {
    private String referenceNumber;
    private LocalDate issueDate;
    private LocalDate periodFrom;
    private LocalDate periodTo;
    private String accountNumber;
    private BigDecimal invoiceAmountPreTax;
    private BigDecimal invoiceAmountTax;
    private BigDecimal invoiceAmountTotal;
    private BigDecimal accountAmountDue;
    private LocalDate paymentDueDate;
    private BigDecimal taxRate;

    public String getReferenceNumber(){
        return referenceNumber;
    }
    public void setReferenceNumber(String referenceNumber){
        this.referenceNumber = referenceNumber;
    }

    public LocalDate getIssueDate(){
        return issueDate;
    }
    public void setIssueDate(LocalDate issueDate){
        this.issueDate = issueDate;
    }

    public LocalDate getPeriodFrom(){
        return periodFrom;
    }
    public void setPeriodFrom(LocalDate periodFrom){
        this.periodFrom = periodFrom;
    }

    public LocalDate getPeriodTo(){
        return periodTo;
    }
    public void setPeriodTo(LocalDate periodTo){
        this.periodTo = periodTo;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public BigDecimal getInvoiceAmountPreTax(){
        return invoiceAmountPreTax;
    }
    public void setInvoiceAmountPreTax(BigDecimal invoiceAmountPreTax){
        this.invoiceAmountPreTax = invoiceAmountPreTax;
    }

    public BigDecimal getInvoiceAmountTax(){
        return invoiceAmountTax;
    }
    public void setInvoiceAmountTax(BigDecimal invoiceAmountTax){
        this.invoiceAmountTax = invoiceAmountTax;
    }

    public BigDecimal getInvoiceAmountTotal(){
        return invoiceAmountTotal;
    }
    public void setInvoiceAmountTotal(BigDecimal invoiceAmountTotal){
        this.invoiceAmountTotal = invoiceAmountTotal;
    }

    public BigDecimal getAccountAmountDue(){
        return accountAmountDue;
    }
    public void setAccountAmountDue(BigDecimal accountAmountDue){
        this.accountAmountDue = accountAmountDue;
    }

    public LocalDate getPaymentDueDate(){
        return paymentDueDate;
    }
    public void setPaymentDueDate(LocalDate paymentDueDate){
        this.paymentDueDate = paymentDueDate;
    }

    public BigDecimal getTaxRate(){
        return taxRate;
    }
    public void setTaxRate(BigDecimal taxRate){
        this.taxRate = taxRate;
    }
}
