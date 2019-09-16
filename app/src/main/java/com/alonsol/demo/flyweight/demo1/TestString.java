package com.alonsol.demo.flyweight.demo1;

public class TestString {

    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = "ab" + "c";

        //使用equals只判定字符值
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str2));

        //等号判等，判定两个对象是不是同一个地址
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str2);
        System.out.println(str4 == str2);
    }
}
