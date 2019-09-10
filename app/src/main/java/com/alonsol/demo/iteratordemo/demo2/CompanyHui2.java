package com.alonsol.demo.iteratordemo.demo2;

public class CompanyHui2 implements Company {

    private Employee[] array = new Employee[3];

    public CompanyHui2() {
        array[0] = new Employee("辉哥", 12, "女", "UI");
        array[1] = new Employee("辉哥", 12, "女", "UI");
        array[2] = new Employee("辉哥", 12, "女", "UI");

    }

    public Employee[] getEmployees() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator(array);
    }
}
