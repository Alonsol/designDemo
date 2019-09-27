package com.alonsol.demo.prictise.unmodifiablelist.demo1;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("001");
        list.add("002");
        Student student = new Student("Tom", list);
        ArrayList<String> anotherlist = student.getCourses();
        anotherlist.add("999");
        System.out.println("Tom course.length =" + student.getCourses());
    }
}
