package com.springboog.ymal.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-19 23:40
 * @Version:v1.0
 */
@Configuration
@ConfigurationProperties(prefix = "test.user")
public class User {

    private String username;

    private Integer age;

    private String tostring;

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

    public String getTostring() {
        return tostring;
    }

    public void setTostring(String tostring) {
        this.tostring = tostring;
    }
}
