package com.JavaMail_Learning.dao.impl;

import com.JavaMail_Learning.dao.UserDao;
import com.JavaMail_Learning.domain.User;
import com.JavaMail_Learning.utils.JDBCUtil;
import jdk.nashorn.internal.scripts.JD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    private static final String INSERT_SQL = "INSERT INTO user(usermail, state, code) VALUE (?, ?, ?)";
    private static final String SELECT_SQL = "SELECT * FROM user WHERE code = ?";
    private static final String UPDATE_SQL = "UPDATE user SET usermail=?, state=?, code=? WHERE usermail=?";
    private static final String DELETE_SQL = "DELETE FROM user WHERE state=?";
    private static final String SELECT_SQL_ISEXIST = "SELECT * FROM user WHERE usermail=?";

    @Override
    //DAO中保存用户的方法
    public void regist(User user) throws Exception {
        Connection conn = null;
        PreparedStatement presta = null;
        ResultSet result = null;

        try {
            conn = JDBCUtil.getDBconnection();
            presta = conn.prepareStatement(INSERT_SQL);
            presta.setString(1, user.getEmail());
            presta.setInt(2, user.getState());
            presta.setString(3, user.getCode());

            presta.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeDB(conn, presta, result);
        }
    }

    //DAO根据激活码查询用户
    @Override
    public User findByCode(String code) throws Exception {
        Connection conn = null;
        PreparedStatement presta = null;
        ResultSet result = null;
        User user = null;

        try {
            conn = JDBCUtil.getDBconnection();
            presta = conn.prepareStatement(SELECT_SQL);
            presta.setString(1, code);
            result = presta.executeQuery();

            if (result.next()) {
                user = new User();
                user.setEmail(result.getString(1));
                user.setState(result.getInt(2));
                user.setCode(result.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeDB(conn, presta, result);
        }
        return user;
    }

    //DAO修改用户方法
    @Override
    public void update(User user) {
        Connection conn = null;
        PreparedStatement presta = null;
        ResultSet result = null;

        try {
            conn = JDBCUtil.getDBconnection();
            presta = conn.prepareStatement(UPDATE_SQL);
            presta.setString(1, user.getEmail());
            presta.setInt(2, 1);
            presta.setString(3, user.getCode());
            presta.setString(4, user.getEmail());
            int rowCount = presta.executeUpdate();
            if(rowCount == 0) {
                throw new Exception("Update Error:UserMail :" + user.getEmail());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeDB(conn, presta, result);
            System.out.println("update operation");
        }

    }

    @Override
    public void delete(User user) {
        Connection conn = null;
        PreparedStatement presta = null;
        ResultSet result = null;

        try {
            conn = JDBCUtil.getDBconnection();
            presta = conn.prepareStatement(DELETE_SQL);
            presta.setInt(1, 0);
            presta.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeDB(conn, presta, result);

        }
    }

    @Override
    public boolean isExist(User user) {
        Connection conn = null;
        PreparedStatement presta = null;
        ResultSet result = null;

        try {
            conn = JDBCUtil.getDBconnection();
            presta = conn.prepareStatement(SELECT_SQL_ISEXIST);
            presta.setString(1, user.getEmail());
            result = presta.executeQuery();
            if (result.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
