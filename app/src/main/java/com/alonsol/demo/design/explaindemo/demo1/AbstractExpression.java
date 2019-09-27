package com.alonsol.demo.design.explaindemo.demo1;

import android.content.Context;

public abstract class AbstractExpression {

    /**
     * 抽象的解析方法
     *
     * @param ctx 上下文环境
     */
    public abstract void interpret(Context ctx);
}
