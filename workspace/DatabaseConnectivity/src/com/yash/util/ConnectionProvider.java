package com.yash.util;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionProvider {
	static private Connection connection;
	static String url = "jdbc:mysql://localhost:3306/databaseconnection";
	static String user = "root";
	static String password = "root";

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return connection;
		}
	}

	public static void close() {
		try {
			connection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}