package com.springboot.jpa;

import com.springboot.jpa.dao.AccountDao;
import com.springboot.jpa.domain.Account;
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
	public void createTableTest() {
		Account account = new Account();
		account.setName("张三");
		account.setMoney(100.0);
        Account result = accountDao.save(account);
        System.out.println(result);
    }

    @Test
    public void queryTableTest() {
        Account result = accountDao.findOne(1);
        System.out.println(result);
    }

}
