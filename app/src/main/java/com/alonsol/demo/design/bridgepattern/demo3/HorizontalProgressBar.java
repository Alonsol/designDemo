package com.alonsol.demo.design.bridgepattern.demo3;

import android.graphics.Canvas;
import android.view.View;

public class HorizontalProgressBar extends BaseProgressBar {
    @Override
    public int getMeasureHeight() {
        return 50;
    }

    @Override
    public int getMeasureWith() {
        return 1000;
    }

    @Override
    public void draw(View view, Canvas canvas) {
        //这里就可以执行具体的绘制水平进度条的操作
    }
}
