package com.alonsol.demo.proxydemo.demo1;


/**
 * 为了保证客户端使用的透明性，委托对象和代理对象需要实现相同的接口
 */
public class ProxySubject extends Subject {

    private RealSubject mSubject;//持有真实主题的引用

    public ProxySubject(RealSubject mSubject) {
        this.mSubject = mSubject;
    }

    @Override
    public void visit() {
        //通过真实主题引用对象调用真实主题中的逻辑方法
        mSubject.visit();
    }
}
