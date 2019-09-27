package com.alonsol.demo.design.vistordemo.demo1;


import java.util.Random;

/**
 * 员工
 */
public abstract class Staff {

    public String name;
    //员工kpi
    public int kpi;

    public Staff(String aName) {
        this.name = aName;
        kpi = new Random().nextInt(10);
    }

    //接收Visitor的访问
    public abstract void accept(Visitor visitor);
}
