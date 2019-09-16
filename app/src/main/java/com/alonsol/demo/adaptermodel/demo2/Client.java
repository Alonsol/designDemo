package com.alonsol.demo.adaptermodel.demo2;

import android.widget.ListView;

public class Client {

    public static void main(String[] args){
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压："+adapter.getVolt5());

    }
}
