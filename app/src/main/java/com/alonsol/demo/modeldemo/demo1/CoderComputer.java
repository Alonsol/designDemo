package com.alonsol.demo.modeldemo.demo1;

public class CoderComputer extends AbstractComputer {

    @Override
    protected void login() {
        System.out.println("程序员只需要进行用户和密码验证就可以了");
    }
}
