package com.springboot.validateform.entity;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2018-10-21 22:10
 * @Version:v1.0
 */
public class PersonForm {

    @NotNull
    @Size(min = 2, max = 30) //长度为2-30的字符串
    private String name;

    @NotNull //不能为null
    @Min(18) //age不能小于18
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonForm{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
