package com.springboot.swagger2.mapper;

import com.springboot.swagger2.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-23 22:32
 * @Version:v1.0
 */
@Repository
public interface UserMapper {

    User queryUserById(Integer id);

    List<User> queryAllUser();
}
