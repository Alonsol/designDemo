package com.alonsol.demo.stragetydemo;

/**
 * 公交车计算策略
 */
public class BusStrategy implements CalculateStrategy {

    /**
     * 背景公交车
     * @param km 公里
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        return 12;
    }
}
