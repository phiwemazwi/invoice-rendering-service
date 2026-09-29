package com.billing.model;

import java.util.ArrayList;
import java.util.List;

public class ChargeSectionList {
    private List<ChargeSection> chargeSections = new ArrayList<>();

    public List<ChargeSection> getChargeSection(){
        return  chargeSections;
    }
    public void setChargeSection(List<ChargeSection> chargeSection){
        this.chargeSections = chargeSection;
    }




}
