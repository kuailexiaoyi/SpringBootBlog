package com.springboot.mail.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-09-26 23:08
 * @Version:v1.0
 */
@Component
public class SendMailConfig {

    @Value("${mail.smtp.auth}")
    private Boolean auth;

    @Value("${mail.transport.protocol}")
    private String protocol;

    @Value("${mail.send.charset}")
    private String charset;

    @Value("${mail.smtp.port}")
    private Integer port;

    @Value("${mail.is.ssl}")
    private Boolean isSSL;

    @Value("${mail.host}")
    private String host;

    @Value("${mail.auth.name}")
    private String name;

    @Value("${mail.smtp.timeout}")
    private String timeout;

    @Value("${mail.auth.password}")
    private String password;

    public Boolean getAuth() {
        return auth;
    }

    public void setAuth(Boolean auth) {
        this.auth = auth;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Boolean getSSL() {
        return isSSL;
    }

    public void setSSL(Boolean SSL) {
        isSSL = SSL;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
