package com.springboot.beatlsql.entity;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-16 23:08
 * @Version:v1.0
 */
public class Account {

    private Integer id;

    private String name;

    private double money;

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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
