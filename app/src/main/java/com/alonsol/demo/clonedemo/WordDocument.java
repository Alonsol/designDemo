package com.alonsol.demo.clonedemo;

import java.util.ArrayList;
import java.util.List;

public class WordDocument implements Cloneable {

    //文本
    private String mText;
    //图片列表
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("----------------WordDocument构造函数-------------------");
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public List<String> getImages() {
        return mImages;
    }

    public void addImage(String img) {
        this.mImages.add(img);
    }


    public void showDocument() {
        System.out.println("------------------word content start-------------------");
        System.out.println("TExt:" + mText);
        System.out.println("Images List:");
        for (String imgName : mImages) {
            System.out.println("image name: " + imgName);
        }
        System.out.println("---------------------------Word cotnent End------------------");
    }

    @Override
    protected WordDocument clone() {

        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
