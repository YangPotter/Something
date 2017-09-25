package com.JavaMail_Learning.utils;
import java.sql.*;

public class JDBCUtil {
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String userName = "why";
    private static String userPwd = "19961206";
    private static String dbName = "javamail_test";

    public static Connection getDBconnection() {
        String url1 = "jdbc:mysql://localhost:3306/" + dbName;
        String url2 = "?user=" + userName + "&password=" + userPwd;
        String url3 = "&useUnicode=true&characterEncoding=utf-8&useSSL=true";
        String url = url1 + url2 + url3;
        try {
            Class.forName(driverName);
            Connection conn = DriverManager.getConnection(url);
            return conn;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void closeDB(Connection conn, PreparedStatement preSta, ResultSet rs) {
        try {
            if(rs != null) rs.close();
            if(preSta != null) preSta.close();
            if(conn != null) conn.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
