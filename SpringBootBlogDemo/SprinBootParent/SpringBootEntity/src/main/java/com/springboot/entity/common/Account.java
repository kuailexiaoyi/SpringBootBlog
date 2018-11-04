package com.springboot.entity.common;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2018-10-23 21:52
 * @Version:v1.0
 */
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue
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
