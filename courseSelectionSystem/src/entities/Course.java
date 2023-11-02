package entities;
/**
 * 课程类
 */
public class Course {
    //课程号
    private int cid;
    //课程名
    private String cname;
    //课程教师
    private String teacher;

    /**
     * 构造器
     */
    public Course(int cid, String cname, String teacher) {
        this.setId(cid);
        this.setName(cname);
        this.setTeacher(teacher);
    }

    /**
     * 设置课程号
     */
    public void setId(int id) {
        this.cid = id;
    }

    /**
     * 获取课程号
     */
    public int getId() {
        return this.cid;
    }

    /**
     * 设置课程名
     */
    public void setName(String name) {
        this.cname = name;
    }

    /**
     * 获取课程名
     */
    public String getName() {
        return this.cname;
    }

    /**
     * 设置课程教师
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * 获取课程教师
     */
    public String getTeacher() {
        return this.teacher;
    }

}