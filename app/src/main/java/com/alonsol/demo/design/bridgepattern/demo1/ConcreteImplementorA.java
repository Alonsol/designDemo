package com.alonsol.demo.design.bridgepattern.demo1;

public class ConcreteImplementorA implements Implementor {


    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA operationImpl");
    }
}
