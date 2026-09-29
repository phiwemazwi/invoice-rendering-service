package com.billing.model;

public class AddressDetails {
    private String street;
    private String city;
    private String province;
    private String country;
    private String postalCode;

    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    public String getProvince(){
        return province;
    }
    public void setProvince(String province){
        this.province = province;
    }

    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    public String getPostalCode(){
        return postalCode;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

}
