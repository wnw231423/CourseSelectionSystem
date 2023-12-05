package com.wnw.vo;
/**
 * 选修课类
 */
public class ElectiveClass extends Course {
    private final static String classType = "选修课";
    /**
     * 默认构造器
     */
    public ElectiveClass(int cid, String cname, Teacher teacher) {
        super(cid, cname, teacher);
    }

    public String getType() {
        return classType;
    }
}