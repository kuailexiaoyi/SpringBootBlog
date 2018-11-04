package com.springboot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2018-10-23 21:27
 * @Version:v1.0
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHell(){
        return "Hello World";
    }

}
