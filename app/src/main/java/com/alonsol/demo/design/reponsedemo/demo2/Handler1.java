package com.alonsol.demo.design.reponsedemo.demo2;

public class Handler1 extends AbstractHandler {


    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler1 handle request:" + request.getRequeseLevel());
    }
}
