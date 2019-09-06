package com.alonsol.demo.factorydemo2;

import com.alonsol.demo.factorydemo.Product;

public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) p;
    }
}
