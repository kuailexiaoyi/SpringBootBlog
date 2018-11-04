package com.springboog.ymal.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-19 23:49
 * @Version:v1.0
 */
@Component
@ConfigurationProperties(prefix = "test.student")
@PropertySource("classpath:student.yml")
public class Student {
    @Value("${username}")
    private String username;

    @Value("${age}")
    private Integer age;

    @Value("${sex}")
    private String sex;

    @Value("${tostring}")
    private String toString;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }
}
