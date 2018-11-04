package com.springboot.redismq.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

import static com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT.value;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-17 22:46
 * @Version:v1.0
 */
@Repository
public class RedisDao {

    @Autowired
    private StringRedisTemplate template;

    public void setKey(String key, String value) {

        ValueOperations<String, String> operations = template.opsForValue();

        operations.set(key, value, 1, TimeUnit.MINUTES);

    }

    public String getValue(String key) {

        ValueOperations<String, String> operations = template.opsForValue();

        String value = operations.get(key);

        return value;

    }
}
