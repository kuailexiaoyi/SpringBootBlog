## 第十一课 SpringBoot集成JMS邮件发送

[TOC]

### 1. 导入jar包

```xml
 <!--springboot发送邮件-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>
```

### 2. 配置application.properties

```properties
spring.mail.host=smtp.163.com
spring.mail.username=XXX@163.com
spring.mail.password=XXX
spring.mail.port=25
spring.mail.protocol=smtp
spring.mail.default-encoding=UTF-8
```

### 3. 发送Text内容的邮件

```java

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationSendMmailTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private JavaMailSenderImpl mailSender;

	public void sendTxtMail() {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

		simpleMailMessage.setTo(new String[]{"XXX@qq.com"});//设置接收邮箱

		simpleMailMessage.setFrom("XXX@163.com");//设置发送邮箱

		simpleMailMessage.setSubject("Spring Boot Mail 邮件测试【文本】");

		simpleMailMessage.setText("这里是一段简单的文本，用于对Spring集成JMS测试");

		mailSender.send(simpleMailMessage);

		System.out.println("邮件已发送");
	}

}
```