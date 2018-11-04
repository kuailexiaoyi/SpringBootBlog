package com.springboot.fastjson.controller;

import com.springboot.fastjson.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-25 23:04
 * @Version:v1.0
 */
@RestController
public class UserController {

    @RequestMapping("users")
    public List<User> getAllUser() {
        List<User> userList = new ArrayList<User>();

        User user1 = new User(1,"zhagnsan1","男");
        User user2 = new User(2,"zhagnsan2","男");
        User user3 = new User(3,"zhagnsan3","男");
        User user4 = new User(4,"zhagnsan4","男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return userList;
    }

    @RequestMapping("hello")
    public String syHello() {
        return "Hello World";
    }
}
