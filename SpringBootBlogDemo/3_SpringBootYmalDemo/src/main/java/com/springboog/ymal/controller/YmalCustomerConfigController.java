package com.springboog.ymal.controller;

import com.springboog.ymal.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-19 23:32
 * @Version:v1.0
 */
@RestController
public class YmalCustomerConfigController {

    @Autowired
    private Student student;

    @RequestMapping("/student")
    public String test() {
//        return "自定义属性Bean：The age of " + user.getUsername() + " age is " + user.getAge();
        return "自定义属性Bean：" + student.getToString();
    }
}

