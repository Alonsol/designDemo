package com.alonsol.demo.design.statedemo.practise;

import android.content.Context;

public class LoginContext {

    //用户状态，默认为未登录状态
    UserState mState = new LogoutState();

    //单例
    static LoginContext sLoginContext = new LoginContext();

    private LoginContext() {
    }

    public static LoginContext getLoginContext() {
        return sLoginContext;
    }

    public void setState(UserState aState) {
        this.mState = aState;
    }

    public void forward(Context context) {
        mState.forward(context);
    }

    public void comment(Context context) {
        mState.comment(context);
    }
}
