package com.alonsol.demo.design.explaindemo.demo2;

public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator("123 + 123 - 123 + 123");
        System.out.println(calculator.calculate());

    }
}
