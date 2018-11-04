package com.springboog.ymal;

import com.springboog.ymal.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application{

	@Autowired
	private Student student;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*@Override
	public void run(String... strings) throws Exception {
		System.out.println("student:"+student.getToString());
	}*/
}
