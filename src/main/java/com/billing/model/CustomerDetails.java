package com.billing.model;

import java.time.LocalDate;
import java.util.StringJoiner;

public class CustomerDetails {
    private String customerName;
    private String primaryAccountNumber;
    private String preferredCurrency;
    private String paymentMethod;
    private LocalDate accountOpened;
    private String accountStatus;

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getPrimaryAccountNumber(){
        return primaryAccountNumber;
    }
    public void setPrimaryAccountNumber(String primaryAccountNumber){
        this.primaryAccountNumber = primaryAccountNumber;
    }

    public String getPreferredCurrency(){
        return preferredCurrency;
    }
    public void setPreferredCurrency(String preferredCurrency){
        this.preferredCurrency = preferredCurrency;
    }

    public String getPaymentMethod(){
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getAccountOpened(){
        return accountOpened;
    }
    public void setAccountOpened(LocalDate accountOpened){
        this.accountOpened = accountOpened;
    }

    public String getAccountStatus(){
        return accountStatus;
    }
    public void setAccountStatus(String accountStatus){
        this.accountStatus = accountStatus;
    }
}
