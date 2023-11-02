package entities;
/**
 * 学生类
 */
public class Student {
    //学生学号
    private int id;
    //学生姓名
    private String name;
    //学生所在专业
    private Major major;

    /**
     * 默认构造器
     */
    public Student(int id, String name, Major major) {
        this.setId(id);
        this.setName(name);
        this.setMajor(major);
    }

    /**
     * 设置学生学号
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取学生id
     */
    public int getId() {
        return this.id;
    }

    /**
     * 设置学生姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学生姓名
     */
    public String getName() {
        return this.name;
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