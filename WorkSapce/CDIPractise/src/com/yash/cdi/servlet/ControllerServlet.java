package com.yash.cdi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.cdi.dao.EmployeeDaoImpl;
import com.yash.cdi.domain.Employee;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("employeeId");
		String name=request.getParameter("employeeName");
		Employee employee= new Employee();
		employee.setId(id);
		employee.setName(name);
		
		EmployeeDaoImpl employeeDaoImpl= new EmployeeDaoImpl();
		employeeDaoImpl.addEmployee(employee);
	}

}
