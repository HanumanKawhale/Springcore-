package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
	
	@Bean(name= {"student","temp"})
	public Student getStudent() {
		//creating new student
		Student student = new Student(getAddress());
		return student;
	}
}
