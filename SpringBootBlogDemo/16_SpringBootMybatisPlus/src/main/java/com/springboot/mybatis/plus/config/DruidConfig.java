package com.springboot.mybatis.plus.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-08 11:06
 * @Version:v1.0
 */
@Configuration
@PropertySource(value = "classpath:druid.properties")
public class DruidConfig {

    @Bean(destroyMethod = "close",initMethod = "init")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();

        return druidDataSource;
    }
}
