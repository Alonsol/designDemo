package com.alonsol.demo.stragetydemo;

public class TaxiStrategy implements CalculateStrategy {


    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
