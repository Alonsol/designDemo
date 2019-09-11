package com.alonsol.demo.vistordemo.demo1;

import java.util.LinkedList;
import java.util.List;

public class BussinessReport {

    List<Staff> mStaffs = new LinkedList<Staff>();

    public BussinessReport() {
        mStaffs.add(new Manager("余经理"));
        mStaffs.add(new Engineer("工程师-小余1"));
        mStaffs.add(new Engineer("工程师-小刘"));
        mStaffs.add(new Engineer("工程师-小王"));
        mStaffs.add(new Engineer("工程师-小徐"));
    }

    public void showReport(Visitor visitor) {
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }
    }

}
