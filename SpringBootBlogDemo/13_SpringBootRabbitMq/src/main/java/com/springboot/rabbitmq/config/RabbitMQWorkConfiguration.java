package com.springboot.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-28 22:21
 * @Version:v1.0
 */
@Configuration
public class RabbitMQWorkConfiguration {

    private final static String QUEUE_WORK_NAME = "test_workfair_queue";

    @Bean
    public Queue workQueue() {
        return new Queue(QUEUE_WORK_NAME, false, false, false, null);
    }
}
