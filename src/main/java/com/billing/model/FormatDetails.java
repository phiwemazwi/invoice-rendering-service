package com.billing.model;

public class FormatDetails {
    private String defaultDeliveryMethod;
    private String accountSubType;

    public String getDefaultDeliveryMethod(){
        return defaultDeliveryMethod;
    }
    public void setDefaultDeliveryMethod(String defaultDeliveryMethod){
        this.defaultDeliveryMethod = defaultDeliveryMethod;
    }

    public String getAccountSubType(){
        return accountSubType;
    }
    public void setAccountSubType(String accountSubType){
        this.accountSubType = accountSubType;
    }
}
