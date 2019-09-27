package com.alonsol.demo.design.clonedemo2;

public class LoginImpl implements Login {


    @Override
    public void login() {
        //登录到服务器，获取到用户信息
        User loginedUser = new User();
        //将服务器返回的完整信息设置给loginUser对象
        loginedUser.age = 12;
        loginedUser.name = "Mr Simple";
        loginedUser.address = new Address("北京市", "海淀区", "花园东路");
        //登录完成之后将用户信息设置到Session中
        LoginSession.getLoginSession().setLoginedUser(loginedUser);
    }
}
