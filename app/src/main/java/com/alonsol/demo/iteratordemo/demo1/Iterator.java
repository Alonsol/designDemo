package com.alonsol.demo.iteratordemo.demo1;


/**
 * 迭代器接口
 * @param <T>
 */
public interface Iterator<T> {

    /**
     * 是否右下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 返回当前位置额元素并将位置移至下一位
     * @return
     */
    T next();
}
