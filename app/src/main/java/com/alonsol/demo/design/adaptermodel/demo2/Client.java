package com.alonsol.demo.design.adaptermodel.demo2;

public class Client {

    public static void main(String[] args){
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压："+adapter.getVolt5());

    }
}
