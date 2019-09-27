package com.alonsol.demo.design.mediatordemo.demo2;


//抽象同事
public abstract class Colleague {

    protected Mediator mediator;//每一个同事都该知道其中的中介

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
