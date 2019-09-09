package com.alonsol.demo.explaindemo.demo2;

import java.util.Stack;

public class Calculator {

    private Stack<ArithmeticExpression> mExpStack = new Stack<>();

    public Calculator(String expression) {
        //声明两个ArithmeticExpression类型的临时变量，存储运算符左右两边的数字解释器
        ArithmeticExpression exp1, exp2;
        //根据空格分割表达式字符串
        String[] elements = expression.split(" ");

        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)) {
                case '+'://如果是加号
                    //将栈中的解释器弹出作为运算符号左边的解释器
                    exp1 = mExpStack.pop();
                    //同时将运算符号数组下标下一个元素构造为一个数字解释器
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    //通过上面两个数字解释器构造加法运算解释器
                    mExpStack.push(new AdditionExpression(exp1, exp2));

                    break;
                case '-':
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new SubstractionExpression(exp1, exp2));
                    break;
                default:
                    /**
                     * 如果不是运算符则为数字
                     * 若是数字，直接构造数字解释器并压入栈
                     */
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calculate() {
        return mExpStack.pop().interpret();
    }
}
