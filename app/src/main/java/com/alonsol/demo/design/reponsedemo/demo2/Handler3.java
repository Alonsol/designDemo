package com.alonsol.demo.design.reponsedemo.demo2;

public class Handler3 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler3 handle request:" + request.getRequeseLevel());
    }
}
