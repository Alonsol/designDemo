package com.alonsol.demo.design.factorypractice;

public class FileHandler extends IOHandler {


    @Override
    public void add(String id, String name) {
        //业务处理
    }

    @Override
    public void remove(String id) {
        //业务处理
    }

    @Override
    public void update(String id, String name) {
        //业务处理
    }

    @Override
    public String query(String id) {
        return "FileHandler result";
    }
}
