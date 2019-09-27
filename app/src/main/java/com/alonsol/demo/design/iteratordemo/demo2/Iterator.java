package com.alonsol.demo.design.iteratordemo.demo2;

public interface Iterator {

    /**
     * 是否有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素，并将位置移至下一位
     * @return
     */
    Object next();
}
