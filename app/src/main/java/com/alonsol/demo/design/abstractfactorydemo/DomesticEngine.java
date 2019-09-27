package com.alonsol.demo.design.abstractfactorydemo;

public class DomesticEngine implements IEngine {

    @Override
    public void engine() {
        System.out.println("普通发动机");
    }
}
