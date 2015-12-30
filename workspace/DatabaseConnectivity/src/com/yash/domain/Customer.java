package com.yash.domain;

public class Customer {
	String name;
	int Id;
	String address;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [Name=" + name + ", Id=" + Id + ", address=" + address
				+ "]";
	}

}
