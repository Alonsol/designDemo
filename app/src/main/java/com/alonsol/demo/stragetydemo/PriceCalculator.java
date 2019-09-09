package com.alonsol.demo.stragetydemo;

public class PriceCalculator {

    //公交车类型
    private static final int BUS = 1;

    //地铁类型
    private static final int SUBWAY = 2;


    private int busPrice(int km) {
        //超过十公里的总距离
        int extraTotal = km - 10;
        //超过的距离是5公里的倍数
        int extraFactor = extraTotal / 5;
        //超过的距离对5公里取余
        int fraction = extraTotal % 5;
        //价格计算
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }

    private int subwayPrice(int km) {
        if (km < 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        }
        //其他距离我们简化为7元
        return 7;
    }

    int calculatePrice(int km, int type) {
        if (type == BUS) {
            return busPrice(km);
        } else if (type == SUBWAY) {
            return subwayPrice(km);
        }
        return 0;
    }

}
