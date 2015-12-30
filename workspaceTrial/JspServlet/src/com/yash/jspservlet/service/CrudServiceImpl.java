package com.yash.jspservlet.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yash.jspservlet.domain.Employee;
import com.yash.jspservlet.util.ConnectionProvider;

public class CrudServiceImpl implements CrudServiceIntf{

	@Override
	public void addEmployee(Employee employee) {
		String 	query= "insert into employee(id, name,contact, address) values("+employee.getId()+", '"+employee.getName()+"','"+employee.getContact()+"', '"+employee.getAddress()+"' )";
		System.out.println(query);
		ConnectionProvider.update(query);
	}

	@Override
	public Employee searchById(Employee employee) {
		String query= "select * from employee where id="+employee.getId();
		System.out.println(query);
		ResultSet resultSet= ConnectionProvider.select(query);
			try {
				while(resultSet.next()){
					employee.setName(resultSet.getString(2));
					employee.setContact(resultSet.getString(3));
					employee.setAddress(resultSet.getString(4));
					return employee;
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public void deleteById(Employee employee) {
		String query= "delete from employee where id="+employee.getId();
		System.out.println(query);
		ConnectionProvider.update(query);
	}

	@Override
	public List showAllEmployee() {
		String query= "select * from employee";
		System.out.println(query);
		
		return null;
	}
	
}
