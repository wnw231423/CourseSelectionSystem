package com.wnw.vo;

import java.util.ArrayList;

/**
 * 专业类
 */
public class Major {
    //专业名
    private String mname;
    //专业学生
    private ArrayList<Student> students;

    /**
     * 默认构造器
     */
    public Major(String name) {
        this.setName(name);
    }

    /**
     * 设置专业名
     */
    public void setName(String name) {
        this.mname = name;
    }

    /**
     * 获取专业的所有学生名单
     */
    public ArrayList<Student> getStudents() {
        return this.students;
    }

    /**
     * 专业添加学生
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String getName() {
        return mname;
    }
}