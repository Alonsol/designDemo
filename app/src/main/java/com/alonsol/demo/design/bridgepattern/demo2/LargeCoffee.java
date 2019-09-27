package com.alonsol.demo.design.bridgepattern.demo2;

public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的"+impl.addSomething()+"咖啡");
    }
}
