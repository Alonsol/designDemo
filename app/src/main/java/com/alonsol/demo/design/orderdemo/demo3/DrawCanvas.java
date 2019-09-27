package com.alonsol.demo.design.orderdemo.demo3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class DrawCanvas extends SurfaceView implements SurfaceHolder.Callback {

    private boolean isDrawing, isRunning;//标识是否可以绘制，绘制线程是否可以运行
    private Bitmap mBitmap;//绘制到的位图对象
    private DrawInvoker mInvoker;//绘制命令的请求对象
    private DrawThread mThread;

    public DrawCanvas(Context context) {
        super(context);
        mInvoker = new DrawInvoker();
        mThread = new DrawThread();
        getHolder().addCallback(this);
    }

    public void add(DrawPath path) {
        mInvoker.add(path);
    }

    /**
     * 重做上一步撤销的绘制
     */
    public void redo() {
        isDrawing = true;
        mInvoker.redo();
    }

    /**
     * 撤销上一步的绘制
     */
    public void undo() {
        isDrawing = true;
        mInvoker.undo();
    }

    /**
     * 是否可有撤销
     *
     * @return
     */
    public boolean canUndo() {
        return mInvoker.canUndo();
    }

    public boolean canRedo() {
        return mInvoker.canRedo();
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        isRunning = true;
        mThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        isRunning = false;
        while (retry) {
            try {
                mThread.join();
                retry = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private class DrawThread extends Thread {
        @Override
        public void run() {
            Canvas canvas = null;
            while (isRunning) {
                if (isDrawing) {
                    try {
                        canvas = getHolder().lockCanvas(null);
                        if (mBitmap == null) {
                            mBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        }
                        Canvas c = new Canvas(mBitmap);
                        c.drawColor(0, PorterDuff.Mode.CLEAR);
                        mInvoker.execute(c);
                        canvas.drawBitmap(mBitmap, 0, 0, null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        getHolder().unlockCanvasAndPost(canvas);
                    }
                    isDrawing = false;
                }
            }
        }
    }
}
