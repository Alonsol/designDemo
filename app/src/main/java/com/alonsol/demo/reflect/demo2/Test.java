package com.alonsol.demo.reflect.demo2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {
//        getPrivateMethod();

//        modifyPrivateFiled();
        modifyFianlField();
    }

    private static void modifyFianlField() throws Exception {

        //获取class实例
        TestClass testClass = new TestClass();
        Class<? extends TestClass> mClass = testClass.getClass();
        //2获取私有常量
        Field finalField = mClass.getDeclaredField("FINAL_VALUE");

        //3.修改常量的值基本类型
        if (finalField != null) {
            //获取私有常量的访问权
            finalField.setAccessible(true);

            //调用finalField的getter方法
            //输出FINAL_VALUE修改前的值
            System.out.println("Before Modify:FINAL_VALUE = " + finalField.get(testClass));

            //修改私有常量
            finalField.set(testClass, "Modified");

            //调用finalField的getter方法
            //输出FINAL_VALUE修改后的值
            System.out.println("After Modify:FINAL_VALUE = " + finalField.get(testClass));

            //调用对象调用类的getter方法
            //获取值并输出
            System.out.println("Actually :FINAL_VALUE = " + testClass.getFinalValue());

        }

        Field finalField2 = mClass.getDeclaredField("FINAL_BOOLEAN");
        //4.修改常量的值 非基本类型
        if (finalField2 != null) {
            //获取私有常量的访问权
            finalField2.setAccessible(true);

            //调用finalField的getter方法
            //输出FINAL_VALUE修改前的值
            System.out.println("Before Modify:FINAL_VALUE = " + finalField2.get(testClass));

            //修改私有常量
            finalField2.set(testClass, false);

            //调用finalField的getter方法
            //输出FINAL_VALUE修改后的值
            System.out.println("After Modify:FINAL_VALUE = " + finalField2.get(testClass));

            //调用对象调用类的getter方法
            //获取值并输出
            System.out.println("Actually :FINAL_VALUE = " + testClass.getBooleanValue());

        }


    }


    private static void modifyPrivateFiled() throws Exception {
        //获取class实例
        TestClass testClass = new TestClass();
        Class mClass = testClass.getClass();

        //获取私有变量
        Field privateField = mClass.getDeclaredField("MSG");

        //3.如果有私有变量
        if (privateField != null) {
            //获取私有变量访问权
            privateField.setAccessible(true);

            //修改私有变量，并输出测试
            System.out.println("Before Modify:MSG = " + testClass.getMsg());

            //调用set(Object,value)修改变量的值
            //privateField是获取到的私有变量
            //test要操作的类
            //”new value“为要修改的值
            // 调用私有变量，并输出以测试
            privateField.set(testClass, true);
            System.out.println("After Modify: MSG =" + testClass.getMsg());


        }

    }

    private static void getPrivateMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //获取class类实例
        TestClass testClass = new TestClass();
        Class mClass = testClass.getClass();

        //2.获取私有方法
        //第一个参数为要获取的私有方法名称
        //第二个为要获取方法的参数类型，参数为class...，没有参数就是null
        //方法参数也可以这么写，new Class[]{String.class,int.class}

        Method privateMethod = mClass.getDeclaredMethod("privateMethod", String.class, int.class);

        //3.开始操作方法
        if (privateMethod != null) {
            //获取私有方法的访问权
            //只是获取访问权，并不是修改实际权限
            privateMethod.setAccessible(true);

            //使用invoke反射调用私有方法
            //privateMethod是获取到的私有方法
            //testClass要操作的对象
            //后面两个参数传实参
            privateMethod.invoke(testClass, "java Reflect", 666);
        }
    }
}
