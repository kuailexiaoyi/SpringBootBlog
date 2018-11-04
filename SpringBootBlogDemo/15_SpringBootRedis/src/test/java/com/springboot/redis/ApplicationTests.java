package com.springboot.redis;

import com.springboot.redis.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void redisTest() {

        //存儲字符串
        redisTemplate.opsForValue().set("a", 1);

        Object a = redisTemplate.opsForValue().get("a");
        System.out.println("a:" + a);

        //存取user对象
        User user = new User(1, "李四");

        redisTemplate.opsForValue().set("user",user);

        Object result = redisTemplate.opsForValue().get("user");

        System.out.println(result.toString());


    }


}
