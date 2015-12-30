package com.yash.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yash.jsp.domain.Customer;
import com.yash.jsp.util.ConnectionProvider;

public class CustomerDao {
	Connection connection= ConnectionProvider.getConnection();
	List<Customer> customers=new ArrayList();
	Customer customer;
	public Customer fetchById(String id){
		String query="SELECT * FROM CUSTOMER WHERE ID=?";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			ResultSet resultSet=preparedStatement.executeQuery(query);
			preparedStatement.setString(1,id);
			customer.setId(resultSet.getString("id"));
			customer.setName(resultSet.getString("name"));
			customer.setAddress(resultSet.getString("address"));
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return customer;
	}
	public List<Customer> fetchAll(){
		String query="SELECT * FROM CUSTOMER";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			ResultSet resultSet=preparedStatement.executeQuery(query);
			while(resultSet.next()){
				String id = resultSet.getString("id");
				  String name = resultSet.getString("name");
				  	String address= resultSet.getString("address");
				  
				  Customer customer = new Customer(id, name, address);

				  customers.add(customer);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return customers;
	}
	
}
	
					
					