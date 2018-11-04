package com.springboot.mybatis.plus;

import com.springboot.mybatis.plus.model.TbUser;
import com.springboot.mybatis.plus.service.TbUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private TbUserService tbUserService;

	@Test
	public void contextLoads() {
	}

	@Test
    public void queryAllUser() {
        List<TbUser> users = tbUserService.selectList(null);
//        TbUser tbUser = tbUserService.selectById(1);
        System.out.println(users);
    }

}
