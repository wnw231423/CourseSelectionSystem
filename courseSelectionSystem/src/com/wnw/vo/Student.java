package com.wnw.vo;
/**
 * 学生类
 */
public class Student extends SchoolMember{
    //学生所在专业
    private Major major;

    /**
     * 默认构造器
     */
    public Student(int id, String name, Major major) {
        super(id, name);
        this.setMajor(major);
    }

    /**
     * 设置学生专业
     */
    public void setMajor(Major major) {
        this.major = major;
    }

    /**
     * 获取学生专业
     */
    public Major getMajor() {
        return this.major;
    }

}