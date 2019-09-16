package com.alonsol.demo.adaptermodel.demo1;

public class Client {

    public static void main(String[] args){
        VoltAdapter adapter = new VoltAdapter();
        System.out.println("输出电压："+adapter.getVolt5());
    }
}
