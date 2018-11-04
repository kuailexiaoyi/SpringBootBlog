package com.springboot.beatlsql.dao;

import com.springboot.beatlsql.entity.Account;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-16 23:09
 * @Version:v1.0
 */
public interface AccountDao extends BaseMapper<Account>{

    @SqlStatement(params = "name")
    Account queryAccountByName(String name);
}
