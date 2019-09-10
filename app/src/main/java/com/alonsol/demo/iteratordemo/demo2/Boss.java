package com.alonsol.demo.iteratordemo.demo2;

import java.util.List;

public class Boss {

    public static void main(String[] args) {
        CompanyMin companyMin = new CompanyMin();
        List<Employee> eleloyees = companyMin.getEleloyees();
        for (int i = 0; i < eleloyees.size(); i++) {
            System.out.println(eleloyees.get(i).toString());
        }

        CompanyHui companyHui = new CompanyHui();
        Employee[] employees = companyHui.getEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        CompanyMin2 companyMin2 = new CompanyMin2();
        check(companyMin2.iterator());

        CompanyHui2 companyHui2 = new CompanyHui2();
        check(companyHui2.iterator());

    }

    private static void check(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
