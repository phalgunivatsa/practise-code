package com.yash.filters.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.mysql.jdbc.Connection;
import com.yash.filters.util.ConnectionProvider;

/**
 * Servlet Filter implementation class PasswordValidator
 */
@WebFilter(urlPatterns={"/filter.do"})
public class PasswordValidator implements Filter {

	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		Connection connection = (Connection) ConnectionProvider.getConnection();
		String userid=request.getParameter("id");
		String password=request.getParameter("password");
		String query= "SELECT * FROM USER";
		try {
			Statement statement= connection.prepareStatement(query);
			ResultSet resultSet=statement.executeQuery(query);
			while(resultSet.next()){
				String id= resultSet.getString(1);
				String pwd= resultSet.getString(2);
				if(userid.equals(id)){
					out.println("Welcome User");
					chain.doFilter(request, response);
				}else{
					out.println("Not a valid user");
				}
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Password validator ---> init");
	}

}
