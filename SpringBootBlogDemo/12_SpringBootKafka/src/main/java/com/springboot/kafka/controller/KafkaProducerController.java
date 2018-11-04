package com.springboot.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-27 07:52
 * @Version:v1.0
 */
@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @RequestMapping("/send")
    public String send(String string) {
        kafkaTemplate.send("mytopic", "1", string);
        return "KafkaProducerController：Kafka发送消息成功！";
    }
}
