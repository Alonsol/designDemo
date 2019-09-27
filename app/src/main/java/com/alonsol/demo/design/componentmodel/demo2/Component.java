package com.alonsol.demo.design.componentmodel.demo2;


/**
 * 透明的组合模式抽象根节点
 */
public abstract class Component {

    protected String name;//节点名

    public Component(String name) {
        this.name = name;
    }

    /**
     * 具体的逻辑方法由子类实现
     */
    public abstract void doSomething();

    public abstract void addChild(Component child);

    public abstract void removeChild(Component child);

    public abstract Component getChildren(int index);

}
