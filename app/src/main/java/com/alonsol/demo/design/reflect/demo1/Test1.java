package com.alonsol.demo.design.reflect.demo1;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Test1 {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) {
        //1.获取并输出类的名称
        Class<SonClass> mClass = SonClass.class;
        System.out.println("类的名称：" + mClass.getName());

        //2.1获取所有public访问权限的访问
//        包括自己声明和从父类继承的
        Method[] methods = mClass.getMethods();

        //2.2获取所有本类的方法（不问访问权限）
//        Method[] methods = mClass.getDeclaredMethods();

        //遍历所有方法
        for (Method method : methods) {
            //获取并输出方法的访问权限（Modifiers：修饰符）
            int modifiers = method.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " ");
            //获取并输出方法的返回值类型
            Class returnType = method.getReturnType();
            System.out.print(returnType.getName() + " " + method.getName() + "(");
            //获取并输出方法的所有参数
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.print(parameter.getType().getName() + " " + parameter.getName() + ",");
                //获取并输出方法的所有参数
            }
            //获取并输出方法抛出的异常
            Class[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes.length == 0) {
                System.out.println(")");
            } else {
                for (Class exceptionType : exceptionTypes) {
                    System.out.println(") throws" + exceptionType.getName());
                }
            }
        }
    }
}
