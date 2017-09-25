package com.JavaMail_Learning.dao;

import com.JavaMail_Learning.domain.User;

public interface UserDao {
    void regist(User user) throws Exception;

    User findByCode(String code) throws Exception;

    void update(User user);

    void delete(User user);

    boolean isExist(User user);
}
