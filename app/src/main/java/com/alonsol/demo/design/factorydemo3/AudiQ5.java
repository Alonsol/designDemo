package com.alonsol.demo.design.factorydemo3;

public class AudiQ5 extends AudiCar {


    @Override
    public void drive() {
        System.out.println("Q5启动了！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5开始自动循环了！");
    }
}
