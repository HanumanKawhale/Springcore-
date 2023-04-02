package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class College {
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public College(String subject) {
		super();
		this.subject = subject;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "College [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("start method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("end method");
	}
	
}
