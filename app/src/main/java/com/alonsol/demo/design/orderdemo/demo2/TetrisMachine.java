package com.alonsol.demo.design.orderdemo.demo2;

public class TetrisMachine {

    /**
     * 真正处理向左操作的逻辑代码
     */
    public void toLeft() {
        System.out.println("向左");
    }

    public void toRight() {
        System.out.println("向右");
    }

    /**
     * 真正处理快速落下的逻辑代码
     */
    public void fastToBottom() {
        System.out.println("快速落下");
    }

    public void transform() {
        System.out.println("改变形状");
    }
}
