package com.alonsol.demo.orderdemo.demo3;

import android.graphics.Canvas;

public interface IDraw {


    /**
     * 绘制命令
     *
     * @param canvas 画布
     */
    void draw(Canvas canvas);


    /**
     * 撤销命令
     */
    void undo();
}
