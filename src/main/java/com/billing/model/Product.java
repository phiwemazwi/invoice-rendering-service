package com.billing.model;

public class Product {
    private String productInstanceId;
    private String status;
    private String invoiceText;
    private Service service;

    public String getProductInstanceId(){
        return productInstanceId;
    }
    public void setProductInstanceId(String productInstanceId){
        this.productInstanceId = productInstanceId;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public String getInvoiceText(){
        return invoiceText;
    }
    public void setInvoiceText(String invoiceText){
        this.invoiceText = invoiceText;
    }

    public Service getService(){
        return service;
    }
    public void setService(Service service){
        this.service = service;
    }
}
