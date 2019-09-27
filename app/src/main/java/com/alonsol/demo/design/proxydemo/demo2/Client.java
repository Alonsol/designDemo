package com.alonsol.demo.design.proxydemo.demo2;

public class Client {

    public static void main(String[] args) {
        //构造一个小明
        ILawsuit xiaomin = new XiaoMin();
        //构造一个代理律师并将小明作为构造参数传递进去
        ILawsuit lawyer = new Lawyer(xiaomin);
        //律师提交诉讼申请
        lawyer.submit();
        //律师举证
        lawyer.burden();
        //律师代理小明进行辩护
        lawyer.defend();
        //完成诉讼
        lawyer.finish();
    }
}
