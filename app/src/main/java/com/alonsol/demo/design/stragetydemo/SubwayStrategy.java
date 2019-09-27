package com.alonsol.demo.design.stragetydemo;


/**
 * 地铁价格计算策略
 */
public class SubwayStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return 5;
    }
}
