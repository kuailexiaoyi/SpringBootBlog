package com.springboot.mybatis.dao;

import com.springboot.mybatis.domain.User;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-22 10:52
 * @Version:v1.0
 */
public interface UserDao {

    User queryUserById(Integer id);

    List<User> queryAllUser();

    Integer addUser(User user);

    Integer updateUser(User user);

    Integer deleteUser(User user);
}
