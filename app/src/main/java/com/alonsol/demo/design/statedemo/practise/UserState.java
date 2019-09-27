package com.alonsol.demo.design.statedemo.practise;


import android.content.Context;

/**
 * 用户状态
 */
public interface UserState {
    /**
     * 转发
     */
    public void forward(Context context);

    /**
     * 评论
     */
    public void comment(Context context);


}
