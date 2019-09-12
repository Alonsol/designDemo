package com.alonsol.demo.proxydemo.demo1;

public class RealSubject extends Subject {


    @Override
    public void visit() {
        //RealSubject中visit的具体逻辑
        System.out.println("Real subject!");
    }
}
