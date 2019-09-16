package com.alonsol.demo.bridgepattern.demo3;

import android.graphics.Canvas;
import android.view.View;

public class VerticalProgressBar extends BaseProgressBar {
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

    }
}
