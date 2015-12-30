package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.domain.Account;
import com.yash.util.ConnectionProvider;

public class AccountDao {
	List list = new ArrayList();

	public int withdraw(int accountid, int withdraw) {
		int total = 0;
		Connection connection = ConnectionProvider.getConnection();
		String query = "SELECT AMOUNT FROM ACCOUNT WHERE ACCOUNTID=?";
		String query1 = "UPDATE ACCOUNT SET AMOUNT=? WHERE ACCOUNTID=?";
		
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setInt(1, accountid);
			preparedStatement.execute();

			ResultSet resultSet = preparedStatement.getResultSet();

			while (resultSet.next()) {
				int amount = resultSet.getInt("Amount");
				if (amount != 0) {
						total = amount - withdraw;
					}
			}
			preparedStatement=connection.prepareStatement(query1);
			preparedStatement.setInt(1, total);
			preparedStatement.setInt(2, accountid);
			preparedStatement.execute();
		
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return total;
	}

	public int deposit(int accountid, int deposit) {
		int total = 0;
		Connection connection = ConnectionProvider.getConnection();
		String query = "SELECT AMOUNT FROM ACCOUNT WHERE ACCOUNTID=?";
		String query1 = "UPDATE ACCOUNT SET AMOUNT=? WHERE ACCOUNTID=?";
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setInt(1, accountid);
			preparedStatement.execute();

			ResultSet resultSet = preparedStatement.getResultSet();

			while (resultSet.next()) {
				int amount = resultSet.getInt("Amount");
				total = amount + deposit;
			}
			preparedStatement=connection.prepareStatement(query1);
			preparedStatement.setInt(1, total);
			preparedStatement.setInt(2, accountid);
			preparedStatement.execute();
				
			} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return total;
	}

	public List viewBalance(int accountid) {
		Account account = new Account();
		Connection connection = ConnectionProvider.getConnection();
		String query = "SELECT * FROM ACCOUNT WHERE ACCOUNTID=?";
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setInt(1, accountid);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("AccountID");
				if (id == accountid) {
					int Accountid = resultSet.getInt("AccountID");
					int balance = resultSet.getInt("Amount");
					list.add(new Account(Accountid, balance));
				}
			}
			ConnectionProvider.close();

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	public void transfer(int accountid, int beneficiaryid,int amount) {
		Connection connection = ConnectionProvider.getConnection();
		String query= "INSERT INTO TRANSFER VALUES(?,?)";
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setInt(1, beneficiaryid);
			preparedStatement.setInt(2, accountid);
			preparedStatement.execute();
			
			withdraw(accountid, amount);
			deposit(beneficiaryid, amount);
			ConnectionProvider.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
		
}
