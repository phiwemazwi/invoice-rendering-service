package com.billing.model;

public class Service {
    private String name;
    private String type;
    private String status;
    private ChargeSectionList chargeSectionList;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public ChargeSectionList getChargeSectionList(){
        return chargeSectionList;
    }
    public void setChargeSectionList(ChargeSectionList chargeSectionList){
        this.chargeSectionList = chargeSectionList;
    }
}
