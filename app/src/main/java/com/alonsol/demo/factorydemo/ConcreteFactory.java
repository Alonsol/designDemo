package com.alonsol.demo.factorydemo;

public class ConcreteFactory extends Factory {


    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
