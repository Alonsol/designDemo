package com.alonsol.demo.statedemo.rightdemo;

public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("关机了，沙雕");
    }

    @Override
    public void prevChannel() {
        System.out.println("关机了，沙雕");
    }

    @Override
    public void turnUp() {
        System.out.println("关机了，沙雕");
    }

    @Override
    public void turnDown() {
        System.out.println("关机了，沙雕");
    }
}
