package com.springboot.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-28 22:36
 * @Version:v1.0
 */
@Configuration
public class RabbitMQTopicConfiguration {

    private final static String ROUTE_FANNOUT_NAME = "test_topic_fanout";
    private final static String QUEUE_ROUTE_SMS_NAME = "test_queue_topic_sms";
    private final static String QUEUE_ROUTE_EMAIL_NAME = "test_queue_topic_email";

    @Bean("exchange")
    public TopicExchange fanoutExchange() {
        return new TopicExchange(ROUTE_FANNOUT_NAME);
    }

    @Bean
    public Queue smsQueue() {
        return new Queue(QUEUE_ROUTE_SMS_NAME, false, false, false, null);
    }

    @Bean
    public Queue emailQueue() {
        return new Queue(QUEUE_ROUTE_EMAIL_NAME, false, false, false, null);
    }

    @Bean
    public Binding smsQueueExchangeBinding(TopicExchange exchange, Queue queue) {
        return BindingBuilder.bind(queue).to(exchange).with("info");
    }

    @Bean
    public Binding emailQueueExchangeBinding(TopicExchange exchange, Queue queue) {
        return BindingBuilder.bind(queue).to(exchange).with("info");
    }
}
