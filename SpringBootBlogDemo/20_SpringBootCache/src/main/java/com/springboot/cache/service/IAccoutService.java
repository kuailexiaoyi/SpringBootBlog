package com.springboot.cache.service;

import com.springboot.cache.entity.Account;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-17 21:29
 * @Version:v1.0
 */
public interface IAccoutService {

    List<Account> queryAll();

    Account queryAccountById(Integer id);

    String queryBook(Integer num);
}
