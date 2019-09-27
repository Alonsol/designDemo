package com.alonsol.demo.design.decorator.demo2;

public class PersonCloth extends Person {

    protected Person mPerson;//保持一个Person类的引用

    public PersonCloth(Person mPerson) {
        this.mPerson = mPerson;
    }

    @Override
    public void dressed() {
        mPerson.dressed();
    }
}
