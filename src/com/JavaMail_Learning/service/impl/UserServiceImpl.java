package com.JavaMail_Learning.service.impl;

import com.JavaMail_Learning.dao.UserDao;
import com.JavaMail_Learning.dao.impl.UserDaoImpl;
import com.JavaMail_Learning.domain.User;
import com.JavaMail_Learning.service.UserService;
import com.JavaMail_Learning.utils.MailUtil;

public class UserServiceImpl implements UserService {

    @Override
    //用户注册业务层的实现
    public void regist(User user) throws Exception {
        //将数据存入数据库
        UserDao userDao = new UserDaoImpl();
        userDao.regist(user);
        //发送一封激活的邮件
        MailUtil.sendMail(user.getEmail(), user.getCode());
    }

    @Override
    public User findByCode(String code) throws Exception {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.findByCode(code);
        return user;
    }

    @Override
    public void update(User user) {
        UserDao userDao = new UserDaoImpl();
        userDao.update(user);
    }

    @Override
    public void delete(User user) {
        UserDao userDao = new UserDaoImpl();
        userDao.delete(user);
    }

    @Override
    public boolean isExist(User user) {
        UserDao userDao = new UserDaoImpl();
        boolean isExist = userDao.isExist(user);
        return isExist;
    }
}
