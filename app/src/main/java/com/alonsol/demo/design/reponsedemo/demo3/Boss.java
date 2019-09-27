package com.alonsol.demo.design.reponsedemo.demo3;

public class Boss extends Leader {
    @Override
    protected void handle(int money) {
        System.out.println("老板批复报销：" + money + "元");
    }

    @Override
    protected int limit() {
        return Integer.MAX_VALUE;
    }
}
