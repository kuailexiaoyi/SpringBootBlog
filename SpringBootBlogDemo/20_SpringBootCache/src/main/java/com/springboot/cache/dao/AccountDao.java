package com.springboot.cache.dao;

import com.springboot.cache.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-17 21:11
 * @Version:v1.0
 */
@Repository
public interface AccountDao {

    List<Account> queryAll();

    Account queryAccountById(Integer id);


}
