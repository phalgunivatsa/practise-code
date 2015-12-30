package com.yash.jspservlet.service;


import java.util.List;

import com.yash.jspservlet.domain.Employee;

public interface CrudServiceIntf {

	public void addEmployee(Employee employee);

	public Employee searchById(Employee employee);

	public void deleteById(Employee employee);

	public List showAllEmployee();

}
