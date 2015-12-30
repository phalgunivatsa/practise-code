package com.yash.ajax.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.ajax.domain.User;
import com.yash.ajax.util.ConnectionProvider;

public class CrudOperations {
	public User validateUser(String id) {
		User user= new User();
		String query = "SELECT * FROM USER WHERE USERID=?";
		Connection connection=ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1,id);
			ResultSet resultSet=preparedStatement.getResultSet();
			while(resultSet.next()){
				
				user.setUserId(resultSet.getString("userId"));
				String name=resultSet.getString("name");
				String address=resultSet.getString("address");
				String contact=resultSet.getString("contact");
				user.setName(name);
				user.setAddress(address);
				user.setContact(contact);
			}
			preparedStatement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}
	
}
