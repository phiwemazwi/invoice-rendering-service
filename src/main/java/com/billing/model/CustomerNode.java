package com.billing.model;

public class CustomerNode {
    private int hierarchyLevel;
    private String name;
    private String accountNumber;

    public int getHierarchyLevel(){
        return hierarchyLevel;
    }
    public void setHierarchyLevel(int hierarchyLevel){
        this.hierarchyLevel = hierarchyLevel;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
}
