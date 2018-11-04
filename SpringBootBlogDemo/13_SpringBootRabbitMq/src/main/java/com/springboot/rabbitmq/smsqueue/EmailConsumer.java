package com.springboot.rabbitmq.smsqueue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-28 22:45
 * @Version:v1.0
 */
@RabbitListener(queues = "test_queue_ps_email")
@Component
public class EmailConsumer {

    @RabbitHandler
    public void process(String message) {
        System.out.println("Email 接收消息：" + message);
    }
}
