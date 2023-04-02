package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean ,DisposableBean{
	private double income;

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(double income) {
		super();
		this.income = income;
	}

	@Override
	public String toString() {
		return "Student [income=" + income + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("init method function");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method function");
	}
	
	
}
