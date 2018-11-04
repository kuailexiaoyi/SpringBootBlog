package com.springboot.cache;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.cache.entity.Account;
import com.springboot.cache.service.impl.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(value = "com.springboot.cache.dao")
@EnableCaching //开启缓存技术
public class ApplicationTests {

    @Autowired
    private AccountService accountService;

	@Test
	public void contextLoads() {
	}

	@Test
    public void testMybatis() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        List<Account> accounts = accountService.queryAll();

        System.out.println("result:"+mapper.writeValueAsString(accounts));
    }

     /**
      * @Description: 没有开启缓存，每隔三秒打印一次记录，开启缓存之后，只有前面两个数据打印等待了3秒，之后的数据就瞬间打印在控制台上了，说明缓存起了作用。
      * @Date: 2018/10/17
      * @Author: zr
      * @param null
      * @Return 
      */
    @Test
    public void testCache() throws JsonProcessingException {
        printlnAccount(1);
        printlnAccount(2);
        printlnAccount(1);
        printlnAccount(1);
        printlnAccount(2);

    }

    private void printlnAccount(Integer id) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Account account = accountService.queryAccountById(id);
        String accountJson = mapper.writeValueAsString(account);
        System.out.println("Account--" +id+ "-->" + accountJson);
    }


    @Test
    public void testJackjson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Account account = accountService.queryAccountById(1);
        String s = mapper.writeValueAsString(account);
        System.out.println("account:" + s);
        Account account1 = mapper.readValue(s, Account.class);

        System.out.println("account1:" + mapper.writeValueAsString(account1));


    }

}
