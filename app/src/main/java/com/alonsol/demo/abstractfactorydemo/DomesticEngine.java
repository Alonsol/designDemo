package com.alonsol.demo.abstractfactorydemo;

public class DomesticEngine implements IEngine {

    @Override
    public void engine() {
        System.out.println("普通发动机");
    }
}
