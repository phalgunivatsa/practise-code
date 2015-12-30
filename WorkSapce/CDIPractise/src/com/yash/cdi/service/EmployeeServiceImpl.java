package com.yash.cdi.service;

import javax.inject.Inject;

import com.yash.cdi.dao.EmployeeDaoImpl;
import com.yash.cdi.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	Employee employee = new Employee();
	
	@Inject
	EmployeeDaoImpl employeeDaoImpl;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
