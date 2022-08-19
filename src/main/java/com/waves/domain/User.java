package com.waves.domain;

import java.time.LocalDate;

/**
 * @author huangWenTao
 * @desc
 * @date 2022/8/19 10:51
 */
public class User {
    private String username;
    private String password;

    private LocalDate birthday;

    public User() {
    }

    public User(String username, String password, LocalDate birthday) {
        this.username = username;
        this.password = password;
        this.birthday = birthday;
    }

    public void init(){
        System.out.println("User 初始化");
    }

    public void destroy(){
        System.out.println("User 销毁了");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
