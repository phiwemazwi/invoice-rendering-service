package com.billing.model;

import java.math.BigDecimal;

public class ChargeSection {
    private String category;
    private String description;
    private BigDecimal amount;

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public BigDecimal getAmount(){
        return amount;
    }
    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }
}
