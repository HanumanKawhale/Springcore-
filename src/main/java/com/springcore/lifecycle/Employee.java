package com.springcore.lifecycle;

public class Employee {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
	
	
	public void init() {
		System.out.println("init method");
	}
	
	public void destroy() {
		System.out.println("destroy method");
	}
}
