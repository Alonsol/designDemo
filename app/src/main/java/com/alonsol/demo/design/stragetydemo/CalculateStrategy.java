package com.alonsol.demo.design.stragetydemo;

public interface CalculateStrategy {

    /**
     * 按距离来计算价格
     * @param km 公里
     * @return 返回价格
     */
    int calculatePrice(int km);
}
