package com.alonsol.demo.design.iteratordemo.demo2;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin {

    private List<Employee> list = new ArrayList<>();

    public CompanyMin() {
        list.add(new Employee("小敏", 22, "女", "UI"));
        list.add(new Employee("小敏", 22, "女", "UI"));
        list.add(new Employee("小敏", 22, "女", "UI"));
        list.add(new Employee("小敏", 22, "女", "UI"));
        list.add(new Employee("小敏", 22, "女", "UI"));
    }

    public List<Employee> getEleloyees() {
        return list;
    }
}
