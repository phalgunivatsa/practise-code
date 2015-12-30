package com.yash.cdi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.yash.cdi.util.ConnectionProvider;
import com.yash.cdi.domain.*;

public class EmployeeDaoImpl {
	public void addEmployee(Employee employee){
		String query = "INSERT INTO EMPLOYEE(ID, NAME) VALUES(?,?)";
		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setString(1, employee.getId() );
			preparedStatement.setString(2, employee.getName() );
			
			int rowsInserted = preparedStatement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
			}catch(SQLException e){
				System.out.println(e.getMessage());
			}
	}
	
	
		
		public void deleteEmployee(String id){
		String query= "DELETE FROM EMPLOYEE WHERE ID=?";
		Connection connection=ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1,id);
			int rowsDeleted = preparedStatement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
		
	/*public void updateEmployee(Employee employee){
	String query="UPDATE EMPLOYEE SET NAME=? WHERE ID=?";
	Connection connection=ConnectionProvider.getConnection();
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setString(2,employee.getId());
		preparedStatement.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	public void selectEmployee(){
	String query="SELECT * FROM EMPLOYEE WHERE ID=?";
	Connection connection=ConnectionProvider.getConnection();
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery(query);
		while(resultSet.next()){
			String id= resultSet.getString("id");
			String name= resultSet.getString("name");
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public ArrayList<Employee> selectAllEmployee(){
		String query="SELECT * FROM EMPLOYEE";
		ArrayList<Employee> employee= null;
		Connection connection=ConnectionProvider.getConnection();
		try {
			employee = new ArrayList<Employee>();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery(query);
			while(resultSet.next()){
				String id= resultSet.getString("id");
				String name= resultSet.getString("name");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return employee;
	}*/
}
