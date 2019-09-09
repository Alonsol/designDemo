package com.alonsol.demo.reponsedemo.demo3;

public class Director extends Leader {
    @Override
    protected void handle(int money) {
        System.out.println("主管批复报销：" + money + "元");
    }

    @Override
    protected int limit() {
        return 5000;
    }
}
