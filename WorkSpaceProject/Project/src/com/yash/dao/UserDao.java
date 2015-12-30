package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.yash.domain.User;
import com.yash.util.ConnectionProvider;

public class UserDao {
	public static int login(String userid, String password) {
		User user=new User();
			Connection connection = ConnectionProvider.getConnection();
			
			String query="SELECT * FROM USER WHERE USERID=? AND PASSWORD=?";
			String query1="SELECT NAME FROM USER WHERE USERID=? AND PASSWORD=?";
			try {
				PreparedStatement  preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, userid);
				preparedStatement.setString(2, password);
				ResultSet resultSet=preparedStatement.executeQuery();
	
				while (resultSet.next()) {
				user.setUserid(resultSet.getString(1));
				user.setPassword(resultSet.getString(2));
				}
				preparedStatement = connection.prepareStatement(query1);
				preparedStatement.setString(1, userid);
				preparedStatement.setString(2, password);
				
				ResultSet resultset=preparedStatement.executeQuery();
				while(resultSet.next()){
				user.setName(resultSet.getString(1));
				}
				
				
				
				
				
					ConnectionProvider.close();
				}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
				return 1;
			}
	
	
	
	public void signup(User user) {
			String query="INSERT INTO USER(NAME, USERID, PASSWORD)VALUES(?,?,?)";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedstatement;
			try {
				preparedstatement = connection.prepareStatement(query);

				preparedstatement.setString(1, user.getName());
				preparedstatement.setString(2, user.getUserid());
				preparedstatement.setString(3, user.getPassword());

				preparedstatement.executeUpdate();
				ConnectionProvider.close();
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}