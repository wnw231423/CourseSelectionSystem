package com.wnw.Dao;

import com.wnw.vo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDao {
    public void insert(Student student) throws SQLException, ClassNotFoundException {
        Connection con = DBConnectionUtil.getConnection();

        String name = student.getName();
        int id = student.getId();
        String major = student.getMajor().getName();

        PreparedStatement sql = con.prepareStatement("insert into 学生 values (?,?,?)");
        sql.setInt(1, id);
        sql.setString(2, name);
        sql.setString(3,major);

        int res = sql.executeUpdate();

        System.out.println("已插入"+res+"条记录！");

        sql.close();
        con.close();
    }

    public void delete(int studentId) throws SQLException, ClassNotFoundException {
        Connection con = DBConnectionUtil.getConnection();

        PreparedStatement sql = con.prepareStatement("delete from 学生 where 学号=?");
        sql.setInt(1,studentId);

        int res = sql.executeUpdate();
        System.out.println("已删除"+res+"条记录！");

        sql.close();
        con.close();
    }

    public void update(Student student) throws SQLException, ClassNotFoundException {
        Connection con = DBConnectionUtil.getConnection();

        String name = student.getName();
        int id = student.getId();
        String major = student.getMajor().getName();

        PreparedStatement sql = con.prepareStatement("update 学生 set 姓名=?,专业=? where 学号=?");
        sql.setString(1, name);
        sql.setString(2,major);
        sql.setInt(3, id);

        int res = sql.executeUpdate();

        System.out.println("已更新"+res+"条记录！");

        sql.close();
        con.close();
    }

    public List<Map<String, Object>> query(String sql, Object... objs) throws SQLException {
        List<Map<String, Object>> list = null;
        Connection conn = null;
        PreparedStatement ptmt = null;
        try {
            conn = DBConnectionUtil.getConnection();
            ptmt = conn.prepareStatement(sql);

            int index = 1;

            for (Object o : objs) {
                ptmt.setObject(index++, o);
            }

            ResultSet rs = ptmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            String[] keys = new String[rsmd.getColumnCount()];
            for (int m = 1; m <= rsmd.getColumnCount(); m++) {
                keys[m - 1] = rsmd.getColumnLabel(m);
            }
            list = new ArrayList<Map<String, Object>>();
            while (rs.next()) {
                Map<String, Object> map = new HashMap<String, Object>();
                for (int n = 0; n < keys.length; n++) {
                    map.put(keys[n], rs.getObject(keys[n]));
                }
                list.add(map);
            }

        } catch (Exception e) {
            e.printStackTrace();
            // throw new Exception(e);
        } finally {
            ptmt.close();
            conn.close();
        }
        return list;
    }


}
