package com.alonsol.demo.statedemo.practise;

import android.content.Context;
import android.widget.Toast;

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
