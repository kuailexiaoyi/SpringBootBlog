package com.springboot.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-28 22:08
 * @Version:v1.0
 */
@Configuration
public class RabbitMQConfiguration {

    private static final String QUEUE_SIMPLE_NAME = "test_simple_queue";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE_SIMPLE_NAME,false,false,false,null);
    }


}
