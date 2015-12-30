package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.yash.domain.Customer;
import com.yash.util.ConnectionProvider;

public class CustomerDao {

	public void save(Customer customer) {
		String query = "INSERT INTO CUSTOMER(Name, ID, Address )VALUES(?,?,?)";
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement preparedstatement;
		try {
			preparedstatement = connection.prepareStatement(query);

			preparedstatement.setString(1, customer.getName());
			preparedstatement.setInt(2, customer.getId());
			preparedstatement.setString(3, customer.getAddress());

			preparedstatement.executeUpdate();
			ConnectionProvider.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void delete(Customer customer) {
		String query = "DELETE FROM CUSTOMER WHERE ID =?";
		Connection connection = ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setInt(1, customer.getId());
			preparedStatement.executeUpdate();
			ConnectionProvider.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Customer> getAllCustomers() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		String query = "SELECT * FROM CUSTOMER";
		Connection connection = ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.execute();

			ResultSet resultSet = preparedStatement.getResultSet();
			while (resultSet.next()) {
				Customer customer = new Customer();
				String name = resultSet.getString("Name");
				int id = resultSet.getInt("ID");
				String address = resultSet.getString("Address");

				customer.setName(name);
				customer.setId(id);
				customer.setAddress(address);

				customers.add(customer);
			}

			ConnectionProvider.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return customers;
	}

	public void update(int id, String Address) {
		
		String query = "UPDATE CUSTOMER SET ADDRESS=? WHERE ID =?";
		Connection connection = ConnectionProvider.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setString(1, Address);
			preparedStatement.setInt(2,id);
			preparedStatement.executeUpdate();
			ConnectionProvider.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Customer getCustomerById(int customerId) {
		return null;
	}
}