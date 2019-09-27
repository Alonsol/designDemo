package com.alonsol.demo.design.componentmodel.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示文件和文件夹的抽象类
 */
public abstract class Dir {

    /**
     * 声明一个List成员变量存储文件夹下所有的元素
     */
    protected List<Dir> dirs = new ArrayList<>();

    private String name;//当前文件或者文件夹名称

    public Dir(String name) {
        this.name = name;
    }

    /**
     * 添加一个文件或者文件夹
     *
     * @param dir
     */
    public abstract void addDir(Dir dir);

    /**
     * 移除一个文件或者文件夹
     *
     * @param dir
     */
    public abstract void rmDis(Dir dir);

    /**
     * 清空文件夹下所有元素
     */
    public abstract void clear();

    /**
     * 输出文件夹目录结构
     */
    public abstract void print();

    /**
     * 获取文件夹下所有的文件或者子文件夹
     * @return
     */
    public abstract List<Dir> getFiles();

    /**
     * 获取文件或者文件夹名称
     * @return
     */
    public String getName(){
        return name;
    }

}
