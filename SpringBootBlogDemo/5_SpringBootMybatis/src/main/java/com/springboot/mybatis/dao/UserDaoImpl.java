package com.springboot.mybatis.dao;

import com.springboot.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-22 10:57
 * @Version:v1.0
 */
@Repository
public class UserDaoImpl implements  UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User queryUserById(Integer id) {

        String sql = "select * from tb_user where id = ?";

        List<User> resultList = jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper(User.class));

        if (resultList != null && !resultList.isEmpty()) {
            return resultList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<User> queryAllUser() {
        String sql = "select * from tb_user";

        List<User> resultList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper(User.class));

       return  resultList;
    }

    @Override
    public Integer addUser(User user) {

        String sql = "INSERT INTO tb_user(username,age) VALUES(?, ?)";

        Integer result = jdbcTemplate.update(sql, user.getUsername(), user.getAge());

        return result;
    }

    @Override
    public Integer updateUser(User user) {
        String sql = "UPDATE  tb_user SET username = ?,age = ? WHERE  id = ?";

        Integer result = jdbcTemplate.update(sql, user.getUsername(), user.getAge(),user.getId());

        return result;
    }

    @Override
    public Integer deleteUser(User user) {
        String sql = "DELETE FROM tb_user  WHERE  id = ?";

        Integer result = jdbcTemplate.update(sql, user.getId());

        return result;
    }
}
