package com.bridgelabz.addressbook_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.bridgelabz.addressbook_springboot"})
public class AddressBookSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(AddressBookSpringBootApplication.class, args);
    }
}
