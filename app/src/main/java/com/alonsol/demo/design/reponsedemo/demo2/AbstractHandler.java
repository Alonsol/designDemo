package com.alonsol.demo.design.reponsedemo.demo2;

public abstract class AbstractHandler {

    protected AbstractHandler nextHandler;//下一个节点上的处理者对象

    public final void handleRequest(AbstractRequest request) {
        //判断当前处理者对象的处理级别是否与请求者的处理级别一致
        if (getHandleLevel() == request.getRequeseLevel()) {
            //一致则由该处理对象处理
            handle(request);
        } else {
            //否则将该请求对象转发给下一个节点上的请求对象
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                //当所有的处理者对象均不能处理该请求时输出
                System.out.println("All of handler can not handle the request");
            }
        }
    }


    protected abstract int getHandleLevel();

    protected abstract void handle(AbstractRequest request);
}
