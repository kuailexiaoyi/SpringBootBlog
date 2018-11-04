package com.springboot.rabbitmq.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description: 消费者
 * @Author: zrblog
 * @CreateTime: 2018-09-28 22:11
 * @Version:v1.0
 */
@RabbitListener(queues = "test_simple_queue")
@Component
public class RabbitMQConsumer {

    @RabbitHandler
    public void process(String message) {
        System.out.println("接收消息 : " + message + ",成功。");
    }
}
