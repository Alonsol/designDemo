package com.alonsol.demo.bridgepattern.demo1;

public abstract class Abstraction {

    private Implementor mImplementor;//声明一个私有成员变量引用实现部分的对象

    public Abstraction(Implementor implementor) {
        mImplementor = implementor;
    }

    public void operation() {
        mImplementor.operationImpl();
    }
}
