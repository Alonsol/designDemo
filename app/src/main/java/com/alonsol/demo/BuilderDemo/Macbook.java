package com.alonsol.demo.BuilderDemo;


/**
 * 具体的computer类，Macbook
 */
public class Macbook extends Computer {

    protected Macbook() {
    }

    @Override
    public void setOs() {
        mOs = "Mac OS X 10.10";
    }


}
