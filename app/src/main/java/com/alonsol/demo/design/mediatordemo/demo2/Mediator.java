package com.alonsol.demo.design.mediatordemo.demo2;




public abstract class Mediator {

    /**
     * 同事对象改变时通知中介者方法
     * 在同事对象改变时由中介者去通知其他的同事对象
     * @param colleague
     */
    public abstract void changed(Colleague colleague);
}
