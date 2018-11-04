package com.springboot.beatlsql;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.beatlsql.dao.AccountDao;
import com.springboot.beatlsql.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private AccountDao accountDao;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testBeetlTest() throws JsonProcessingException {
//        List<Account> resultList = accountDao.all();
        Account account = accountDao.queryAccountByName("李四");

        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(account);
        System.out.println("queryAccountByName:" + str);
    }

}
