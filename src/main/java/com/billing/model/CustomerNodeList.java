package com.billing.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerNodeList {
    List<CustomerNode> customerNodes = new ArrayList<>();

    public List<CustomerNode> getCustomerNodes(){
        return customerNodes;
    }
    public void setCustomerNodes(List<CustomerNode> customerNodes){
        this.customerNodes = customerNodes;
    }
}
