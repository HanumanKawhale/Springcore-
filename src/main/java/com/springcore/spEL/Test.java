package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/spEL/config.xml");
		
		Demo demo = con.getBean("demo",Demo.class);
		System.out.println(demo);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		org.springframework.expression.Expression exp =  temp.parseExpression("22+22");
		
		System.out.println(exp.getValue()); 
	}

}
