package com.alonsol.demo.clonedemo2;


/**
 * 登录Session
 */
public class LoginSession {

    static LoginSession sLoginSessionn = new LoginSession();

    private LoginSession() {
    }

    //已登录用户
    private User loginedUser;

    public static LoginSession getLoginSession() {
        return sLoginSessionn;
    }

    //设置已登录的用户信息，不对外开放
    void setLoginedUser(User user) {
        loginedUser = user;
    }

    public User getLoginedUser() {
        return loginedUser.clone();
    }
}

