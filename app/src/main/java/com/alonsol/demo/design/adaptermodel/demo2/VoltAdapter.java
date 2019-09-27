package com.alonsol.demo.design.adaptermodel.demo2;

public class VoltAdapter implements FiveVolt {

    Volt220 mVolt220;


    public VoltAdapter(Volt220 adaptee) {
        mVolt220 = adaptee;
    }

    public int getVolt220(){
        return mVolt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
