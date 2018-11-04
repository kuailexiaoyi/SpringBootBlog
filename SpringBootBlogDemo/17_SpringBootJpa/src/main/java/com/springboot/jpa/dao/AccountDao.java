package com.springboot.jpa.dao;

import com.springboot.jpa.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-10 22:53
 * @Version:v1.0
 */
public interface AccountDao extends JpaRepository<Account,Integer> {
}
