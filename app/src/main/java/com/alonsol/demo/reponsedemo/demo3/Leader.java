package com.alonsol.demo.reponsedemo.demo3;

public abstract class Leader {

    protected Leader nextHandler;//上一级领导处理者

    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (null != nextHandler) {
                nextHandler.handleRequest(money);
            }
        }
    }

    protected abstract void handle(int money);

    protected abstract int limit();
}
