package com.alonsol.demo.reponsedemo.demo2;

public abstract class AbstractRequest {

    private Object obj;//处理对象

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }


    public Object getContext() {
        return obj;
    }

    public abstract int getRequeseLevel();
}
