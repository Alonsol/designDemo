package com.alonsol.demo.design.reponsedemo.demo2;

public class Request2 extends AbstractRequest {

    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getRequeseLevel() {
        return 2;
    }
}
