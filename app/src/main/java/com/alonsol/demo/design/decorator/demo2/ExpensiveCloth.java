package com.alonsol.demo.design.decorator.demo2;

public class ExpensiveCloth extends PersonCloth {

    public ExpensiveCloth(Person mPerson) {
        super(mPerson);
    }

    private void dressShirt(){
        System.out.println("穿短袖");
    }

    private void dressLeather(){
        System.out.println("穿皮衣");
    }

    private void dressJean(){
        System.out.println("穿条牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
