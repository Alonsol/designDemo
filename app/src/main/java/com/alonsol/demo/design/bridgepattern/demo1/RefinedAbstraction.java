package com.alonsol.demo.design.bridgepattern.demo1;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refindedOperation() {
        //客户端逻辑
    }
}
