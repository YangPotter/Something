package com.JavaMail_Learning.service;

import com.JavaMail_Learning.domain.User;

public interface UserService {
    void regist(User user) throws Exception;

    User findByCode(String code) throws Exception;

    void update(User user);

    void delete(User user);

    boolean isExist(User user);
}
