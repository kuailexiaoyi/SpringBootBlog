package com.springboot.mongodb.entity;

import org.springframework.data.annotation.Id;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-15 23:12
 * @Version:v1.0
 */
public class Customer {

    @Id
    public String id;

    public String firstName;

    public String lastName;

    public Customer() {
        super();
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public java.lang.String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                '}';
    }
}
