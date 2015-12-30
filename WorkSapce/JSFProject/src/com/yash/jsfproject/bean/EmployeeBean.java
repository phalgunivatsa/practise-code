package com.yash.jsfproject.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.jsfproject.util.ConnectionProvider;

@ManagedBean
@SessionScoped
public class EmployeeBean {
	private String name;
	private int contact;
	private String gender;
	private String email;
	private String address;
	private String dob;
	private int yearsOfExperience;
	private int[] technologiesKnown;
	private String terms;
	
	
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public int[] getTechnologiesKnown() {
		return technologiesKnown;
	}
	public void setTechnologiesKnown(int[] technologiesKnown) {
		this.technologiesKnown = technologiesKnown;
	}
	
	public String addUser(){
		String query = "INSERT INTO EMPLOYEE(name)VALUES(?)";
		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);

			preparedStatement.setString(1,getName());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return "";
	}
}
