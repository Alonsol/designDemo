package com.alonsol.demo.design.iteratordemo.demo2;

public class CompanyHui {

    private Employee[] array = new Employee[3];

    public CompanyHui() {
        array[0] = new Employee("辉哥", 11, "男", "码农");
        array[1] = new Employee("辉哥", 11, "男", "码农");
        array[2] = new Employee("辉哥", 11, "男", "码农");
    }

    public Employee[] getEmployees() {
        return array;
    }
}
