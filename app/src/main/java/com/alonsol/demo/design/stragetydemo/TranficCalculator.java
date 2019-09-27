package com.alonsol.demo.design.stragetydemo;


//公交出行价格计算器
public class TranficCalculator {

    private CalculateStrategy mStrategy;

    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        //设置计算策略
        calculator.setStrategy(new BusStrategy());
        System.out.println("公交车乘16公里的价格：" + calculator.calculatePrice(16));

        calculator.setStrategy(new TaxiStrategy());
        System.out.println("出租车16公里价格：" + calculator.calculatePrice(16));
    }

    public void setStrategy(CalculateStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }
}
