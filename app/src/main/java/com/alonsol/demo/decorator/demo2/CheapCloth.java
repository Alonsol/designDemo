package com.alonsol.demo.decorator.demo2;

public class CheapCloth extends PersonCloth {

    public CheapCloth(Person mPerson) {
        super(mPerson);
    }

    public void dressShorts(){
        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
