package com.springboot.mongodb;

import com.springboot.mongodb.dao.CustomerDao;
import com.springboot.mongodb.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private CustomerDao customerDao;

    @Override
    public void run(String... strings) throws Exception {
        customerDao.save(new Customer("Alice", "Smith"));
        customerDao.save(new Customer("Jane", "Sms"));

        System.out.println("Customers found with findAll()");

        System.out.println("---------------------------------");

        //获取所有的用户
        List<Customer> results = customerDao.findAll();
        for (Customer result : results) {
            System.out.println(result);
        }

        System.out.println();

        //获取指定用户
        System.out.println("Customer found with findByFirstName('Alice')");
        System.out.println("------------------------------");
        System.out.println(customerDao.findByFirstName("Alice"));

        System.out.println("Customer found with findByLastName('Sms')");
        System.out.println("------------------------------");
        System.out.println(customerDao.findByLastName("Sms"));
    }
}
