package com.alonsol.demo.design.observerdemo.demo1;

import java.util.Observable;

public class Juejin extends Observable {

    public void postNewPublication(String content) {
        //标识状态或者内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
}
