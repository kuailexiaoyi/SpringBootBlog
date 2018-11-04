package com.springboot.redismq.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.CountDownLatch;

/**
 * @Description: 消息接收者
 * @Author: zrblog
 * @CreateTime: 2018-10-17 22:31
 * @Version:v1.0
 */
public class Receiver {

    static final Logger logger =  LoggerFactory.getLogger(Receiver.class);

    public CountDownLatch latch;

    @Autowired
    public Receiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void handleMessage(String message) {
        logger.info("Received <" + message + ">");
        latch.countDown();
    }

}
