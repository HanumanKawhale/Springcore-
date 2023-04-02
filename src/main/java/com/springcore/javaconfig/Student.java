package com.springcore.javaconfig;

public class Student {
	
	private Address address;
	
	public Student(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void study() {
		this.address.display();
		System.out.println("study");
	}
}
