package com.alonsol.demo.reponsedemo.demo3;

public class GroupLeader extends Leader {


    @Override
    protected void handle(int money) {
        System.out.println("组长批复报销" + money + "元");
    }

    @Override
    protected int limit() {
        return 1000;
    }
}
