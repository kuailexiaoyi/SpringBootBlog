package com.springboot.fastjson.domain;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-25 23:05
 * @Version:v1.0
 */
public class User {
    private Integer id;

    private String name;

    private String sex;

    public User() {
        super();
    }

    public User(Integer id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
