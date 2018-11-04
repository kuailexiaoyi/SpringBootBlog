package com.springboot.service.impl;

import com.springboot.dao.AccountDao;
import com.springboot.entity.common.Account;
import com.springboot.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2018-10-23 21:57
 * @Version:v1.0
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> list() {
        return accountDao.findAll();
    }
}
