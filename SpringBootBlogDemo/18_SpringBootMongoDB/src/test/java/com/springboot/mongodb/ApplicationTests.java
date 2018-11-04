package com.springboot.mongodb;

import com.springboot.mongodb.dao.CustomerDao;
import com.springboot.mongodb.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private CustomerDao customerDao;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testMongoDBTest() {
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
