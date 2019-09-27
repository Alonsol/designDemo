package com.alonsol.demo.design.mediatordemo.demo1;

public class ConcreteMediator extends Mediator {


    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }
}
