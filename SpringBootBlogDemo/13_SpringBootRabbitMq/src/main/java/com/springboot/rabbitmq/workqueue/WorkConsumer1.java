package com.springboot.rabbitmq.workqueue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-28 22:22
 * @Version:v1.0
 */
@RabbitListener(queues = "test_workfair_queue")
@Component
public class WorkConsumer1 {


    @RabbitHandler
    public void process(String message) throws InterruptedException {
        System.out.println("消费者1接收消息：" + message);

        Thread.sleep(1000);

    }
}
