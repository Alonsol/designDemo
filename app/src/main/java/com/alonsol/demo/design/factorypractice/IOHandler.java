package com.alonsol.demo.design.factorypractice;


public abstract class IOHandler {


    /**
     * 添加一条个人信息
     * @param id    身份证号码
     * @param name  名字
     */
    public abstract void add(String id, String name);

    /**
     * 删除一条个人信息
     * @param id 身份证号码
     */
    public abstract void remove(String id);

    /**
     * 更新一条个人信息
     * @param id  身份证号码
     * @param name  名字
     */
    public abstract void update(String id,String name);


    /**
     * 查询身份证对应的人名
     * @param id    身份证号
     * @return 人名
     */
    public abstract String query(String id);

}
