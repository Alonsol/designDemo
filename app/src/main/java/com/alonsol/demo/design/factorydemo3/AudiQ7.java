package com.alonsol.demo.design.factorydemo3;

public class AudiQ7 extends AudiCar {


    @Override
    public void drive() {
        System.out.println("Q7启动了！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7开始自动巡航了！");
    }
}
