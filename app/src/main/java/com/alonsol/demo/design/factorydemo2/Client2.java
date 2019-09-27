package com.alonsol.demo.design.factorydemo2;

import com.alonsol.demo.design.factorydemo.ConcreteProductA;
import com.alonsol.demo.design.factorydemo.ConcreteProductB;
import com.alonsol.demo.design.factorydemo.Product;

public class Client2 {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product p1 = factory.createProduct(ConcreteProductA.class);
        p1.method();

        Product p2 = factory.createProduct(ConcreteProductB.class);
        p2.method();
    }
}
