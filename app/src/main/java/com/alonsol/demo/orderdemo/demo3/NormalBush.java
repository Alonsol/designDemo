package com.alonsol.demo.orderdemo.demo3;

import android.graphics.Path;

public class NormalBush implements IBush {


    @Override
    public void down(Path path, float x, float y) {
        path.moveTo(x, y);
    }

    @Override
    public void move(Path path, float x, float y) {
        path.lineTo(x, y);
    }

    @Override
    public void up(Path path, float x, float y) {
    }
}
