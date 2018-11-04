package com.springboot.log4j.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-25 07:07
 * @Version:v1.0
 */
@RestController
public class Log4jController {

    private static final Logger logger = LoggerFactory.getLogger(Log4jController.class);

    @RequestMapping("/log4j")
    public String sayHello() throws JsonProcessingException {
        logger.info("Hello World");
        return "Hello World";
    }
}
