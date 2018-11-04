package com.springboog.ymal.controller;

import com.springboog.ymal.config.PropertiesConfig;
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
public class YmalTestController {

    @Autowired
    private PropertiesConfig propertiesConfig;

    @RequestMapping("/test")
    public String test() {
        return "The age of " + propertiesConfig.getName() + " age is " + propertiesConfig.getAge();
    }
}

