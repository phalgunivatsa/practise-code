package com.yash.sca.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;


import java.sql.ResultSet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yash.sca.util.ConnectionProvider;

@ManagedBean
@SessionScoped
public class CustomerBean {
	private String name;
	private int contact;
	private String email;
	private String address;
	private String username;
	private String password;

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String saveUser() {
		
		String query = "INSERT INTO CUSTOMER (NAME,CONTACT,EMAIL,ADDRESS,USERNAME,PASSWORD) VALUES(?,?,?,?,?,?)";
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedstatement;

		try {

			preparedstatement = connection.prepareStatement(query);
			preparedstatement.setString(1, getName());
			preparedstatement.setInt(2, getContact());
			preparedstatement.setString(3, getEmail());
			preparedstatement.setString(4, getAddress());
			preparedstatement.setString(5, getUsername());
			preparedstatement.setString(6, getPassword());
			preparedstatement.executeUpdate();

			ConnectionProvider.close();

		} catch (Exception e) {

		}
		return "";
	}

	public String validateUser() {
	
		String query = "SELECT * FROM CUSTOMER WHERE USERNAME = ? AND PASSWORD = ?";
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedstatement;
		try {
			
			preparedstatement = connection.prepareStatement(query);
			preparedstatement.setString(1, getUsername());
			preparedstatement.setString(2, getPassword());
			preparedstatement.executeQuery();
			ResultSet resultSet=preparedstatement.getResultSet();
			while (resultSet.next()) {
				System.out.println("after while");
				String dbusername= resultSet.getString("username");
				String dbpassword = resultSet.getString("password");
				if (dbusername.equals(getUsername())
						&& (dbpassword.equals(getPassword()))) {
					return "shopping";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "Register";

	}
}
