package com.alonsol.demo.design.orderdemo.demo1;

public class ConcreteCommand implements Command {

    private Receiver receiver;//持有一个接收者对象的引用

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //调用接收者的相关方法执行具体逻辑
        receiver.action();
    }

}
