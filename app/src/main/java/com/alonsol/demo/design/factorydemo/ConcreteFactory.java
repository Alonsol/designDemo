package com.alonsol.demo.design.factorydemo;

public class ConcreteFactory extends Factory {


    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
