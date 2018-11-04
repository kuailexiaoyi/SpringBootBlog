package com.springboot.devtools.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: SpringBoot热部署测试
 * @Author: zrblog
 * @CreateTime: 2018-09-19 23:12
 * @Version:v1.0
 */

@RestController
public class DevToolsController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World";

    }
}
