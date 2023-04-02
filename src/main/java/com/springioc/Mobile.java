package com.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
}
