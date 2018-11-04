package com.springboog.ymal.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-19 23:29
 * @Version:v1.0
 */
@Component
public class PropertiesConfig {

    @Value("${test.user.username}")
    private String name;

    @Value("${test.user.age}")
    private Integer age;

    @Value("${test.user.tostring}")
    private String toString;

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

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }
}
