import com.wnw.vo.*;
import com.wnw.Dao.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class test2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //初始化专业
        Major sim = new Major("信息管理与信息系统");
        Major cs = new Major("计算机科学与技术");
        Major mathematic = new Major("数学");

        //初始化学生
        Student a = new Student(202301, "张三", sim);
        Student b = new Student(202302, "李四", cs);
        Student c = new Student(202303, "王五", mathematic);
        ArrayList<Student> stu = new ArrayList<>();
        stu.add(a);
        stu.add(b);
        stu.add(c);

        StudentDao dao = new StudentDao();
        //测试insert
        for (Student s:stu) dao.insert(s);

        //测试update
        b.setName("新李四");
        dao.update(b);

        //测试delete
        dao.delete(202303);

        //测试query
        StringBuffer sb = new StringBuffer();
        sb.append("select * from 学生");
        List<Map<String, Object>> list =  dao.query(sb.toString(), new String[] { });

        if(null != list && 0 != list.size()) {
            Iterator<Map<String, Object> > iterator = list.iterator();
            while(iterator.hasNext()) {
                Map<String, Object> map = iterator.next();
                String name = (String)map.get("姓名");
                String major = (String)map.get("专业");
                int id = (int)map.get("学号");
                System.out.println(id+"\t"+name+"\t"+major);
            }
        }
    }
}
