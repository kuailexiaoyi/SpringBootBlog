package com.springboot.cache.service.impl;

import com.springboot.cache.dao.AccountDao;
import com.springboot.cache.entity.Account;
import com.springboot.cache.service.IAccoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-17 21:30
 * @Version:v1.0
 */
@Service
public class AccountService implements IAccoutService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> queryAll() {
        return accountDao.queryAll();
    }

    @Override
    @Cacheable("queryAccountById")
    public Account queryAccountById(Integer id) {
        simulateSlowService();
        return accountDao.queryAccountById(id);
    }

    @Override
    @Cacheable("books")  /**开启缓存策略*/
    public String queryBook(Integer num) {
        simulateSlowService();
        return num + "-- > Some Book";
    }

     /**
      * @Description: 延时三秒
      * @Date: 2018/10/18 22:32
      * @Author: zr
      * @param null
      * @Return 
      */
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
