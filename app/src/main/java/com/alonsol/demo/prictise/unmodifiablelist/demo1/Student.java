package com.alonsol.demo.prictise.unmodifiablelist.demo1;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<String> courses;

    public Student(String name, ArrayList<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
