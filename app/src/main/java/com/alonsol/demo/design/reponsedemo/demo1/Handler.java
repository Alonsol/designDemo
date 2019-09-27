package com.alonsol.demo.design.reponsedemo.demo1;

public abstract class Handler {

    protected Handler successor;//下一节点的处理者

    public abstract void handleRequest(String condition);

}
