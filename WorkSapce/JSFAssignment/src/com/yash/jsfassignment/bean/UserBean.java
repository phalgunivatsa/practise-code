package com.yash.jsfassignment.bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.jsfassignment.util.ConnectionProvider;
@ManagedBean
@SessionScoped
public class UserBean {
	private String name;
	private int salary;

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
	
	public String addUser(){
		String query = "INSERT INTO USER(name,salary) VALUES(?,?)";
		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);

			preparedStatement.setString(1, getName());
			preparedStatement.setInt(2, getSalary());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return "";
		}
}
	

