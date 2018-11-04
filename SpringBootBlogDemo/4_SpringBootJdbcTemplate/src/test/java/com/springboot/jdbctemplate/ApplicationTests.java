package com.springboot.jdbctemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.jdbctemplate.domain.User;
import com.springboot.jdbctemplate.service.UserService;
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
	private UserService userService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testJdbcTemplate() throws JsonProcessingException {
        List<User> users = userService.queryAllUser();
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(users);
        System.out.println(s);
    }

}
