package com.springboot.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private AmqpTemplate amqpTemplate;

	@Test
	public void contextLoads() {
	}

	/*
	* 测试简单RabbitMQ简单队列
	*
	* */
	@Test
	public void testSimpleQueue() {
		String message = "Hello,RabbitMQ";
		amqpTemplate.convertAndSend("test_simple_queue",message);
		System.out.println("发送消息： " + message + "，成功。");
	}

    /*
    * 测试RabbitMQ工作队列
    *
    * */
    @Test
    public void testWorkQueue() {

        for (int i = 0; i < 20;i++){
            String message = "Hello,RabbitMq--->" + i;
            //发送消息
            amqpTemplate.convertAndSend("test_workfair_queue",message);
            System.out.println("发送消息： " + message + "，成功。");
            try {
                Thread.sleep(i*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*
   * 测试RabbitMQ订阅模式
   *
   * */
    @Test
    public void testSMSQueue() {
        String message = "Hello,RabbitMq";
        //发送消息
        amqpTemplate.convertAndSend("test_a_exchange_fanout", "",message);
        System.out.println("发送消息： " + message + "，成功。");
    }

    /*
   * 测试RabbitMQ路由模式
   *
   * */
    @Test
    public void testRouteQueue() {
        String message = "Hello,RabbitMq,路由模式";
        //发送消息
        amqpTemplate.convertAndSend("test_exchange_fanout","info" , message);
        System.out.println("发送消息： " + message + "，成功。");
    }

    /*
   * 测试RabbitMQ主題模式
   *
   * */
    @Test
    public void testTopicQueue() {
        String message = "Hello,RabbitMq,主題模式";
        //发送消息
        amqpTemplate.convertAndSend("test_topic_fanout","info" , message);
        System.out.println("发送消息： " + message + "，成功。");
    }
}
