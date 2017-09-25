package com.JavaMail_Learning.domain;

/*
 *用户实体类
 */
public class User {
    private String email;
    private int state;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
