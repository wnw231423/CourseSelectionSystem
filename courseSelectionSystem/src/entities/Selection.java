package entities;
/**
 * 学生选课类
 */
public class Selection {
    //学生
    private Student student;
    //课程
    private Course course;
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
        return sn + "\t" +cn;
    }
}