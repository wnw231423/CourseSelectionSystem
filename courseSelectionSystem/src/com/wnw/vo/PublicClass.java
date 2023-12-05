package com.wnw.vo;
/**
 * 公共课类
 */
public class PublicClass extends Course {
    private final static String classType = "公共课";
    /**
     * 默认构造器
     */
    public PublicClass(int cid, String cname, Teacher teacher) {
        super(cid, cname, teacher);
    }

    public String getType() {
        return classType;
    }
}