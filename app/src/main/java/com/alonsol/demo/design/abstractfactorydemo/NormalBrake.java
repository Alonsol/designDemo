package com.alonsol.demo.design.abstractfactorydemo;

public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
