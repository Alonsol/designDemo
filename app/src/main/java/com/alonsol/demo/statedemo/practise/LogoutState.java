package com.alonsol.demo.statedemo.practise;

import android.content.Context;

public class LogoutState implements UserState{
    @Override
    public void forward(Context context) {
        System.out.println("跳转到登录页面");
    }

    @Override
    public void comment(Context context) {
        System.out.println("跳转到登录页面");
    }
}
