package com.springboot.kafka.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-27 07:52
 * @Version:v1.0
 */
@Component
public class KafkaConsumerController {

    @KafkaListener(topics = "mytopic")
    public void listen(ConsumerRecord<?, ?> record) {

        System.out.printf("topic = %s, offest = %d, value = %s\n",record.topic(),record.offset(),record.value());
    }
}
