package com.alonsol.demo.design.orderdemo.demo3;

import android.graphics.Path;

public interface IBush {

    /**
     * 触点接触时
     *
     * @param path 路径对象
     * @param x    当前位置x坐标
     * @param y    当前位置y坐标
     */
    void down(Path path, float x, float y);


    /**
     * 触点移动时
     *
     * @param path
     * @param x
     * @param y
     */
    void move(Path path, float x, float y);

    /**
     * 触点离开时
     * @param path
     * @param x
     * @param y
     */
    void up(Path path, float x, float y);
}
