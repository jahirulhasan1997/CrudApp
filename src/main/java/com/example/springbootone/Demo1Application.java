package com.example.springbootone;
import java.util.Optional;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.springbootone.dao.UserRepository;
import com.example.springbootone.entities.user;

@SpringBootApplication
@ComponentScan({"com.example.springbootone.EmployeeController"})
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Demo1Application.class, args);
	

	      
	}

}
