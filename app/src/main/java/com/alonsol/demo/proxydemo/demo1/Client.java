package com.alonsol.demo.proxydemo.demo1;

public class Client {

    public static void main(String[] args) {

        //构造一个真实主题对象
        RealSubject real = new RealSubject();

        //通过真实主题对象构造一个代理对象
        ProxySubject proxySubject = new ProxySubject(real);
        //调用代理对象相关方法
        proxySubject.visit();
    }
}
