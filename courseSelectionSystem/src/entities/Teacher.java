package entities;

import java.util.ArrayList;

public class Teacher extends SchoolMember {
    private ArrayList<Course> courses;

    public Teacher(int id, String name) {
        super(id, name);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
}
