package com.yash.jsfel.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.jsfel.domain.Address;

@ManagedBean
@SessionScoped
public class UserBean {
	private String name;
	private int salary;
	private Address address=new Address();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	} 
	
	


	
	
	
}
