package com.springcore.sterio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con =  new ClassPathXmlApplicationContext("com/springcore/sterio/config.xml");
		
		Student student =  con.getBean("student" ,Student.class);
		System.out.println(student);
	}

}
