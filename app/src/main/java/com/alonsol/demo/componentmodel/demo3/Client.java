package com.alonsol.demo.componentmodel.demo3;

public class Client {

    public static void main(String[] args) {
        //构造一个目录对象表示C盘根目录
        Dir diskC = new Folder("C");

        //C盘根目录下有一个文件 haha.txt文件
        diskC.addDir(new File("haha.txt"));
        //C盘根目录下有3个子目录Window,PerfLogs,Program File
        Dir dirWin = new Folder("Windows");
        //Windows目录下有文件explorer.exe
        dirWin.addDir(new File("explorer.exe"));
        diskC.addDir(dirWin);

        //PerfLogs目录
        Dir dirPer = new Folder("PerfLogs");
        //PerfLogs目录下有null.txt
        dirPer.addDir(new File("null.txt"));
        diskC.addDir(dirPer);

        //Program File目录
        Dir dirPro = new Folder("Program File");
        //Program目录下有文件ftp.txt
        dirPro.addDir(new File("ftp.txt"));
        diskC.addDir(dirPro);

        //打印文件结构
        diskC.print();


    }
}
