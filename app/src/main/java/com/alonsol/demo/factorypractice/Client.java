package com.alonsol.demo.factorypractice;

public class Client {

    public static void main(String[] args) {
        FileHandler ioHandler = IOFactory.getIOHandler(FileHandler.class);
        System.out.println(ioHandler.query("11"));

        XMLHandler ioHandler1 = IOFactory.getIOHandler(XMLHandler.class);
        System.out.println(ioHandler1.query("11"));

        DBHandler ioHandler2 = IOFactory.getIOHandler(DBHandler.class);
        System.out.println(ioHandler2.query("11"));
    }
}
