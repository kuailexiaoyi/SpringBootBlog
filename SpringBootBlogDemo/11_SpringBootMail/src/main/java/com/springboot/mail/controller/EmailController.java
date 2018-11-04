package com.springboot.mail.controller;

import com.springboot.mail.config.SendMailConfig;
import com.springboot.mail.utils.EmailUtils;
import com.sun.mail.util.MailSSLSocketFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-25 23:50
 * @Version:v1.0
 */
@RestController
public class EmailController {

    @Autowired
    private SendMailConfig mailConfig;

    @RequestMapping("sendEmail")
    public String sendMail() throws MessagingException {
        boolean se = EmailUtils.sendEmail("SpringBoot发送邮件测试", new String[]{"409718341@qq.com"}, null, "<h3><a href='http://www.baidu.com'>百度一下，你就知道</a></h3>", null);
        String host = mailConfig.getHost();

        return "发送邮件:" + host;

    }

    public  boolean sendMail(String subject, String[] toUsers, String[] ccUsers, String content, List<Map<String, String>> attachfiles) {

        boolean flag = true;

        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();

        javaMailSender.setHost(mailConfig.getHost());
        javaMailSender.setUsername(mailConfig.getName());
        javaMailSender.setPassword(mailConfig.getPassword());
        javaMailSender.setDefaultEncoding(mailConfig.getCharset());
        javaMailSender.setProtocol(mailConfig.getProtocol());
        javaMailSender.setPort(mailConfig.getPort());

        Properties properties = new Properties();
        properties.setProperty("mail.smtp.auth", mailConfig.getAuth().toString());
        properties.setProperty("mail.smtp.timeout", mailConfig.getTimeout());

        boolean isSSL = mailConfig.getSSL();
        if (isSSL) {
            MailSSLSocketFactory sf = null;
            try {
                sf = new MailSSLSocketFactory();
                sf.setTrustAllHosts(true);
                properties.put("mail.smtp.ssl.enable", "true");
                properties.put("mail.smtp.ssl.socketFactory", sf);
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
            }
        }

        javaMailSender.setJavaMailProperties(properties);

        try {
            MimeMessage mailMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mailMessage, true);
            mimeMessageHelper.setTo(toUsers);

            if (ccUsers != null && ccUsers.length > 0) {
                mimeMessageHelper.setCc(ccUsers);
            }

            mimeMessageHelper.setFrom("corderrui@163.com");
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(content, true);

            if (attachfiles != null && attachfiles.size() > 0) {
                for(Map<String,String> attachFile: attachfiles){
                    String attachFileName = attachFile.get("name");
                    File file = new File(attachFile.get("file"));
                    mimeMessageHelper.addAttachment(attachFileName,file);
                }
            }
            javaMailSender.send(mailMessage);
        } catch (MessagingException e) {
            flag = false;
            e.printStackTrace();
        }

        return flag;
    }

}
