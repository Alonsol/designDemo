package com.alonsol.demo.adaptermodel.demo1;

public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}
