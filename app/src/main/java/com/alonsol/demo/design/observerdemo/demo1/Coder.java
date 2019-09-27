package com.alonsol.demo.design.observerdemo.demo1;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {

    public String name;

    public Coder(String aName) {
        name = aName;
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi," + name + ",掘金更新了，内容：" + arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
