package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
	//registering shutdown hook
		context.registerShutdownHook();
	
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
		System.out.println("++++++++++++++++++++");
		
		
		
		College college = (College) context.getBean("college");
		System.out.println(college);
	}

}
