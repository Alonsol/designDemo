package com.alonsol.demo.design.bridgepattern.demo3;

import android.graphics.Canvas;
import android.view.View;

public class CircleProgressBar extends BaseProgressBar {
    @Override
    public int getMeasureHeight() {
        return 500;
    }

    @Override
    public int getMeasureWith() {
        return 500;
    }

    @Override
    public void draw(View view, Canvas canvas) {

    }
}
