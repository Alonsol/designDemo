package com.alonsol.demo.clonedemo;


public class Client {
    public static void main(String[] args) {
        //1.构建文档对象
        WordDocument originDoc = new WordDocument();
        //编辑文档，添加图片等
        originDoc.setText("这是一篇文档");
        originDoc.addImage("图片1");
        originDoc.addImage("图片2");
        originDoc.addImage("图片3");
        originDoc.showDocument();

        //以原始文档为原型，拷贝一份副本
        WordDocument doc2 = originDoc.clone();
        doc2.showDocument();
        //修改文档副本，不会影响原始文档
        doc2.setText("这是修改过的doc2文本");
        doc2.addImage("haha.jpg");
        doc2.showDocument();
        originDoc.showDocument();
    }
}
