package com.springboot.druid.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-25 07:49
 * @Version:v1.0
 */
@RestController
public class DruidController {

    private static final Logger logger = LoggerFactory.getLogger(DruidController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("users")
    @ResponseBody
    public List<Map<String, Object>> queryAllUser() {
        List<Map<String, Object>> resultList = jdbcTemplate.queryForList("SELECT id,username,age FROM tb_user", new Object[]{});
        return resultList;
    }
}
