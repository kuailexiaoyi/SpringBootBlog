package com.springboot.rabbitmq.routequeue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-28 22:45
 * @Version:v1.0
 */
@RabbitListener(queues = "test_queue_route_email")
@Component
public class RouteEmailConsumer {

    @RabbitHandler
    public void process(String message) {
        System.out.println("路由模式：Email 接收消息：" + message);
    }
}
