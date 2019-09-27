package com.alonsol.demo.design.statedemo.practise;

import android.content.Context;

public class LoginedState implements UserState {

    @Override
    public void forward(Context context) {
        System.out.println("转发微博");
    }

    @Override
    public void comment(Context context) {
        System.out.println("评论微博");
    }
}
