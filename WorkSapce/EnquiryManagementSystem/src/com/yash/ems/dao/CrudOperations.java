package com.yash.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.yash.ems.domain.User;
import com.yash.ems.util.ConnectionProvider;

public class CrudOperations {
	public boolean registerUser(User user) {
		String query = "INSERT INTO USER(name,emailId,type,status,username,password) VALUES(?,?,?,?,?,?)";
		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);

			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmailId());
			preparedStatement.setInt(3, user.getType());
			preparedStatement.setInt(4, user.getStatus());
			preparedStatement.setString(5, user.getUsername());
			preparedStatement.setString(6, user.getPassword());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return true;
	}

		public boolean validateUser(String username, String password) {
		String query = "SELECT USERNAME , PASSWORD FROM USER";

		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery(query);
			while (resultSet.next()) {
				String un = resultSet.getString("username");
				String pwd = resultSet.getString("password");
				if (un.equalsIgnoreCase(username)
						&& (pwd.equalsIgnoreCase(password))) {
					return true;
				}
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return false;
		}
}
	

		
		