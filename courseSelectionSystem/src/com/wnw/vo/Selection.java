package com.wnw.vo;
/**
 * 学生选课类
 */
public class Selection {
    //学生
    private final Student student;
    //课程
    private final Course course;
    /**
     * 默认构造器
     */
    public Selection(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    @Override
    public String toString() {
        String sn = this.student.getName();
        String cn = this.course.getName();
        String ct = this.course.getTeacher().getName();
        String cl = this.course.getType();
        return sn + "\t" +cn + "\t" + ct + "\t" + cl;
    }
}