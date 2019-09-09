package com.alonsol.demo.reponsedemo.demo2;

public class Request3 extends AbstractRequest {

    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequeseLevel() {
        return 3;
    }
}
