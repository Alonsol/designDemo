package com.alonsol.demo.bridgepattern.demo1;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refindedOperation() {
        //客户端逻辑
    }
}
