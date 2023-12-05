import com.wnw.vo.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        //初始化专业
        Major sim = new Major("信息管理与信息系统");
        Major cs = new Major("计算机科学与技术");
        Major mathematic = new Major("数学");

        //初始化教师
        Teacher smith = new Teacher(910001, "Smith");
        Teacher ellen = new Teacher(910002, "Ellen");
        Teacher danveno = new Teacher(910003, "Danveno");
        Teacher john = new Teacher(910004, "John");
        Teacher david = new Teacher(910005, "David");
        Teacher bell = new Teacher(910006, "Bell");

        //初始化课程
        RequiredClass math = new RequiredClass(201, "高等数学", smith);
        RequiredClass english = new RequiredClass(202, "英语", ellen);
        ElectiveClass java = new ElectiveClass(301, "Java程序设计", danveno);
        ElectiveClass ai = new ElectiveClass(302, "人工智能", john);
        PublicClass art = new PublicClass(101, "美术鉴赏", david);
        PublicClass music = new PublicClass(102, "音乐鉴赏", bell);
        ArrayList<RequiredClass> req = new ArrayList<RequiredClass>();
        req.add(math);
        req.add(english);
        ArrayList<ElectiveClass> ele = new ArrayList<ElectiveClass>();
        ele.add(java);
        ele.add(ai);
        ArrayList<PublicClass> pub = new ArrayList<PublicClass>();
        pub.add(art);
        pub.add(music);

        //初始化学生
        Student a = new Student(202301, "张三", sim);
        Student b = new Student(202302, "李四", cs);
        Student c = new Student(202303, "王五", mathematic);
        ArrayList<Student> stu = new ArrayList<>();
        stu.add(a);
        stu.add(b);
        stu.add(c);

        try {
            String dir = "student_course.txt";
            PrintWriter writer = new PrintWriter(dir);

            writer.println("==选课信息表==");
            writer.println("=============");
            writer.println("学生\t课程\t教师\t课程类型\n");

            for (Student s:stu) {
                Random random = new Random();
                Selection publicSelection = new Selection(s, pub.get(random.nextInt(0, pub.size())));
                Selection requiredSelection = new Selection(s, req.get(random.nextInt(0, req.size())));
                Selection electiveSelection = new Selection(s, ele.get(random.nextInt(0, ele.size())));

                writer.println(publicSelection);
                writer.println(requiredSelection);
                writer.println(electiveSelection);
            }

            writer.close();

            System.out.println("文件创建成功。");
        } catch (FileNotFoundException e) {
            System.out.println("创建文件时出现错误：" + e.getMessage());
        }
    }
}