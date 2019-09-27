package com.alonsol.demo.design.observerdemo.demo1;

public class Test {

    public static void main(String[] args) {
        //被观察的角色
        Juejin juejin = new Juejin();
        //观察者
        Coder coder1 = new Coder("coder1");
        Coder coder2 = new Coder("coder2");
        Coder coder3 = new Coder("coder3");
        Coder coder4 = new Coder("coder4");

        //将观察者注册到可观察对象的观察列表中
        juejin.addObserver(coder1);
        juejin.addObserver(coder2);
        juejin.addObserver(coder3);
        juejin.addObserver(coder4);

        //发布消息
        juejin.postNewPublication("新的一期开发者技术前线周报发布啦！");
    }
}
