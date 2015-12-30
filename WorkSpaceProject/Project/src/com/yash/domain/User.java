package com.yash.domain;

public class User {
	private String name;
	private String password;
	private String userid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", userid="
				+ userid + "]";
	}


}
