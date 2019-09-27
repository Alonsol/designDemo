package com.alonsol.demo.design.singlemodel.rightSample;

import android.graphics.Bitmap;

public class DoubleCache implements ImageCache {

    ImageCache mMemoryCache= new MemoryCache();
    ImageCache mDiskCache=new DiskCache();

    //先从内存缓存中获取图片，如果没有，再从sd卡中获取
    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryCache.get(url);
        if (bitmap == null) {
            bitmap = mDiskCache.get(url);
        }
        return bitmap;
    }

    public void put(String url, Bitmap bmp) {
        mMemoryCache.put(url, bmp);
        mDiskCache.put(url, bmp);
    }
}
