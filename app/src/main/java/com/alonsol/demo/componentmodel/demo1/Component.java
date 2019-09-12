package com.alonsol.demo.componentmodel.demo1;


/**
 * 抽象根节点
 */
public abstract class Component {

    protected String name;//英文名

    public Component(String name) {
        this.name = name;
    }

    //具体的逻辑方法由子类实现
    public abstract void doSomething();
}
