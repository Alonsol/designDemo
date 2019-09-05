package com.alonsol.demo.clonedemo2;


public class Address {
    //城市
    public String city;
    //区
    public String district;
    //街道
    public String street;

    public Address(String aCity, String aDist, String aStreet) {
        city = aCity;
        district = aDist;
        street = aStreet;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

