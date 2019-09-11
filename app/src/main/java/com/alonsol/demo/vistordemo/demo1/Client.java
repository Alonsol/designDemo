package com.alonsol.demo.vistordemo.demo1;

public class Client {

    public static void main(String[] args) {

        //构建报表
        BussinessReport report = new BussinessReport();
        System.out.println("===============给CEO看的报表======================");
        //设置访问者，这里是CEO
        report.showReport(new CEOVisitor());
        System.out.println("===============给CTO看的报表======================");
        //注入另一个访问者，CTO
        report.showReport(new CTOVisitor());
    }
}
