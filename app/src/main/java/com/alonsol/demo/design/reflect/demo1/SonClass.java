package com.alonsol.demo.design.reflect.demo1;

public class SonClass extends FatherClass {

    private String sonName;
    protected int sonAge;
    public String sonBirthday;

    @Override
    public void printFatherMsg() {
        System.out.println("Son msg -name:" + sonName + ";age:" + sonAge);
    }

    private void setSonName(String name) {
        sonName = name;
    }

    private void setSonAge(int age) {
        sonAge = age;
    }

    private int getSonAge() {
        return sonAge;
    }

    private String getSonName() {
        return sonName;
    }

    private void setSonBirthday(String sonBirthday) {
        this.sonBirthday = sonBirthday;
    }

    private String getSonBirthday() {
        return sonBirthday;
    }
}
