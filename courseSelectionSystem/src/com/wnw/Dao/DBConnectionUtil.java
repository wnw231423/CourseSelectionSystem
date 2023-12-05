package com.wnw.Dao;

import java.io.IOException;
import java.sql.*;
import java.util.ResourceBundle;

public class DBConnectionUtil {

    public static Connection getConnection () throws ClassNotFoundException, SQLException {
        ResourceBundle properties = ResourceBundle.getBundle("com.wnw.Dao.db");

        String URL = properties.getString("jdbc.url");
        String username = properties.getString("jdbc.username");
        String password = properties.getString("jdbc.password");
        String driver = properties.getString("jdbc.driver");

        Class.forName(driver);
        Connection con = DriverManager.getConnection(URL, username, password);

        return con;
    }

    /**
     * 关闭数据库连接
     * @param rs
     * @param statement
     * @param con
     */
    public static void close(ResultSet rs,Statement statement,Connection con){
        try {
            if(rs!=null)rs.close();
            if(statement!=null)statement.close();
            if(con!=null)con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
