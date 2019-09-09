package com.alonsol.demo.reponsedemo.demo2;

public class Request1 extends AbstractRequest {


    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequeseLevel() {
        return 1;
    }
}
