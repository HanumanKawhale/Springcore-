package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{12+12}")
	private int n;
	@Value("#{12-1}")
	private int m;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	@Value("#{new java.lang.String('Hanuman')}")
	private String name;
	
	@Value("#{8>5}")
	private boolean active;
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	@Override
	public String toString() {
		return "Demo [n=" + n + ", m=" + m + ", z=" + z + ", e=" + e + ", name=" + name + ", active=" + active + "]";
	}
	
}
