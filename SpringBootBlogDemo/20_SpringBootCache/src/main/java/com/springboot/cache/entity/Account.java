package com.springboot.cache.entity;


/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-17 21:10
 * @Version:v1.0
 */
public class Account {

    private Integer id;

    private String name;

    private Double money;

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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
