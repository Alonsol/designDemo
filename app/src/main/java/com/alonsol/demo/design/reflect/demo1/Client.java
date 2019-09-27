package com.alonsol.demo.design.reflect.demo1;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Client {

    public static void main(String[] args) {
        //获取并输出类的名称
        Class mClass = SonClass.class;
        System.out.println("类的名称：" + mClass.getName());

        //获取所有public访问权限的变量
        //包括本类声明的和从父类继承的
        Field[] fields = mClass.getFields();

        //2.2获取所有本类声明的变量（公有和私有）
//        Field[] fields = mClass.getDeclaredFields();

        //3.遍历变量并输出变量信息
        for (Field field : fields) {
            //获取访问权限并输出
            int modifiers = field.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " ");
            //输出变量的类型以及变量名
            System.out.println(field.getType().getName() + " " + field.getName());

        }
    }
}
