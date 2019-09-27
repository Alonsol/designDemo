package com.alonsol.demo.design.iteratordemo.demo2;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin2 implements Company {

    private List<Employee> list=new ArrayList<>();

    public CompanyMin2(){
        list.add(new Employee("小明",11,"男","程序员"));
        list.add(new Employee("小明",11,"男","程序员"));
        list.add(new Employee("小明",11,"男","程序员"));
        list.add(new Employee("小明",11,"男","程序员"));
        list.add(new Employee("小明",11,"男","程序员"));
    }


    public List<Employee> getEmployees(){
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MinIterator(list);
    }
}
