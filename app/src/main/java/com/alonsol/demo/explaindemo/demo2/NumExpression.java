package com.alonsol.demo.explaindemo.demo2;

public class NumExpression extends ArithmeticExpression {

    private int num;

    public NumExpression(int num) {
        this.num = num;
    }


    @Override
    public int interpret() {
        return num;
    }
}
