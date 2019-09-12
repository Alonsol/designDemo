package com.alonsol.demo.mediatordemo.demo1;

public class ConcreteMediator extends Mediator {


    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }
}
