package com.alonsol.demo.design.bridgepattern.demo2;

public class MiddleCoffee extends Coffee {

    public MiddleCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("中杯的" + impl.addSomething() + "咖啡");
    }
}
