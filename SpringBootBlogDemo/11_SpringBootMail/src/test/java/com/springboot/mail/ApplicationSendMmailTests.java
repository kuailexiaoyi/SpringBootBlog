package com.springboot.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationSendMmailTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private JavaMailSenderImpl mailSender;

	/*@Test
	public void sendTextMail(){
		SimpleMailMessage simpleMailMessage =  new SimpleMailMessage();

		//設置收件人，寄件人
		simpleMailMessage.setTo(new String[]{"409718341@qq.com"});

		simpleMailMessage.setFrom("coderrui@163.com");

		simpleMailMessage.setSubject("Spring Boot Mail 邮件测试【文本】 ");

		simpleMailMessage.setText("<a href='www.baidu.com' style='color:red;'>");

		mailSender.send(simpleMailMessage);

		System.out.println("发送邮件成功");
	}*/

	public void sendTxtMail() {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

		simpleMailMessage.setTo(new String[]{"409718341@qq.com"});

		simpleMailMessage.setFrom("coderrui@163.com");

		simpleMailMessage.setSubject("Spring Boot Mail 邮件测试【文本】");

		simpleMailMessage.setText("这里是一段简单的文本，用于对Spring集成JMS测试");

		mailSender.send(simpleMailMessage);

		System.out.println("邮件已发送");
	}

}
