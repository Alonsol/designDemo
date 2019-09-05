package com.alonsol.demo.BuilderDemo;


/**
 * 计算机抽象类，即Product角色
 */
public abstract class Computer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOs;

    protected Computer() {
    }

    //设置cpu核心数
    public void setBoard(String board) {
        mBoard = board;
    }

    //设置内存
    public void setDisplay(String display) {
        mDisplay = display;
    }

    //设置操作系统
    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
