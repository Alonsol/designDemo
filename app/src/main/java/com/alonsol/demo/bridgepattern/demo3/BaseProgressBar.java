package com.alonsol.demo.bridgepattern.demo3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public abstract class BaseProgressBar {

    public static final int HORIZONTAL = 0;//水平进度条标识
    public static final int VERTICAL = 1;//垂直进度条标识
    public static final int CIRCLE = 2;//圆形进度条标识

    protected Paint mPaint;

    protected BaseProgressBar() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
    }


    /**
     * 获取测量高度，由具体子类实现
     *
     * @return
     */
    public abstract int getMeasureHeight();


    /**
     * 获取测量宽度，由具体子类实现
     *
     * @return
     */
    public abstract int getMeasureWith();

    /**
     * 具体的绘制操作，由具体子类实现
     * @param view
     * @param canvas
     */
    public abstract void draw(View view, Canvas canvas);

}
