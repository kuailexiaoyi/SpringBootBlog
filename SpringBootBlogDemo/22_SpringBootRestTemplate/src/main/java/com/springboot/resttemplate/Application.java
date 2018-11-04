package com.springboot.resttemplate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {
		return args -> {
            String resultStr = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", String.class);
            System.out.println(resultStr);
        };
	}

}
