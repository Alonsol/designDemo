package com.alonsol.demo.design.clonedemo2;


public class User implements Cloneable {

    public int age;
    public String name;
    public String phoneNum;
    public Address address;


    @Override
    protected User clone() {
        User user = null;
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address=" + address +
                '}';
    }
}
