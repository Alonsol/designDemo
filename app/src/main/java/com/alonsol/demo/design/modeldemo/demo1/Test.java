package com.alonsol.demo.design.modeldemo.demo1;

public class Test {

    public static void main(String[] args) {
        AbstractComputer comp = new CoderComputer();
        comp.startUp();

        comp = new MilitaryComputer();
        comp.startUp();
    }
}
