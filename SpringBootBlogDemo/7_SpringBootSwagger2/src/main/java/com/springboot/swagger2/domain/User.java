package com.springboot.swagger2.domain;

import java.util.Date;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-22 10:51
 * @Version:v1.0
 */
public class User {

    private Integer id;

    private String username;

    private Integer age;

    private Date ctm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }
}
