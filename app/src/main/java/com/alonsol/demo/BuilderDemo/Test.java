package com.alonsol.demo.BuilderDemo;

public class Test {

    public static void main(String[] args) {

        //构建器
        Builder builder = new MacbookBuilder();
        //Director
        Director director = new Director(builder);
        //封装构建过程，4核心，内存2GB，Mac系统
        director.construct("英特尔主板", "Retina显示器");
        //构建计算机，输出相关信息
        System.out.println("Computer info:" + builder.create().toString());
    }
}
