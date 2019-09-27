package com.alonsol.demo.design.abstractfactorydemo;

public class SeniorBrake implements IBrake {

    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
