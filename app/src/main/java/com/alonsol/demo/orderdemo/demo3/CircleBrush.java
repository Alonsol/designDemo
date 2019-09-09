package com.alonsol.demo.orderdemo.demo3;

import android.graphics.Path;

public class CircleBrush implements IBush {
    @Override
    public void down(Path path, float x, float y) {

    }

    @Override
    public void move(Path path, float x, float y) {
        path.addCircle(x, y, 10, Path.Direction.CW);
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
