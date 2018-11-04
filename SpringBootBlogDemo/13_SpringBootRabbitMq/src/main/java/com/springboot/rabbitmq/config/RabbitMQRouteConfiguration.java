package com.springboot.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-28 22:36
 * @Version:v1.0
 */
@Configuration
public class RabbitMQRouteConfiguration {

    private final static String ROUTE_FANNOUT_NAME = "test_route_fanout";
    private final static String QUEUE_ROUTE_SMS_NAME = "test_queue_route_sms";
    private final static String QUEUE_ROUTE_EMAIL_NAME = "test_queue_route_email";

    @Bean("exchange")
    public DirectExchange fanoutExchange() {
        return new DirectExchange(ROUTE_FANNOUT_NAME);
    }

    @Bean
    public Queue queue() {
        return new Queue(QUEUE_ROUTE_SMS_NAME, false, false, false, null);
    }

    @Bean
    public Queue fanoutEmailQueue() {
        return new Queue(QUEUE_ROUTE_EMAIL_NAME, false, false, false, null);
    }

    @Bean
    public Binding smsQueueExchangeBinding(DirectExchange exchange, Queue queue) {
        return BindingBuilder.bind(queue).to(exchange).with("info");
    }

    @Bean
    public Binding emailQueueExchangeBinding(DirectExchange exchange, Queue queue) {
        return BindingBuilder.bind(queue).to(exchange).with("info");
    }
}
