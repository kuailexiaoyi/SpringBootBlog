package com.springboot.rabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-28 22:45
 * @Version:v1.0
 */
@RabbitListener(queues = "test_queue_topic_sms")
@Component
public class TopicSmsConsumer {

    @RabbitHandler
    public void process(String message) {
        System.out.println("主題模式：SMS 接收消息：" + message);
    }
}
