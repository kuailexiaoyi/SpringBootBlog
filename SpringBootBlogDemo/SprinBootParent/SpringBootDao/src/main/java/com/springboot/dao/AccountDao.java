package com.springboot.dao;

import com.springboot.entity.common.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2018-10-23 21:56
 * @Version:v1.0
 */
@Repository
public interface AccountDao extends JpaRepository<Account,Integer> {
}
