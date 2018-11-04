package com.springboot.mybatis.mapper;

import com.springboot.mybatis.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-23 22:32
 * @Version:v1.0
 */

public interface UserMapper {

    @Select("SELECT * FROM tb_user WHERE id = #{id}")
    User queryUserById(Integer id);

    @Select("SELECT * FROM tb_user")
    List<User> queryAllUser();
}
