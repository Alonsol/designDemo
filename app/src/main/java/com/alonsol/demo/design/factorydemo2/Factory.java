package com.alonsol.demo.design.factorydemo2;

import com.alonsol.demo.design.factorydemo.Product;

public abstract class Factory {

    /**
     * 抽象工厂方法
     * @param clz   产品对象类类型
     * @param <T>   产品对象类类型
     * @return 具体产品对象
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
