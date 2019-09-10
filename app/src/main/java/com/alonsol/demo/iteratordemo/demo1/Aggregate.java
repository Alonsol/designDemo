package com.alonsol.demo.iteratordemo.demo1;


/**
 * 容器接口
 * @param <T>
 */
public interface Aggregate<T> {

    /**
     * 添加一个元素
     * @param obj 元素对象
     */
    void add(T obj);

    /**
     * 移除一个元素
     * @param obj
     */
    void remove(T obj);

    Iterator<T> iterator();
}
