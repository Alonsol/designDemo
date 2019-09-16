package com.alonsol.demo.facade.demo1;

public class PhoneImpl implements Phone {

    @Override
    public void dial() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断电话");
    }
}
