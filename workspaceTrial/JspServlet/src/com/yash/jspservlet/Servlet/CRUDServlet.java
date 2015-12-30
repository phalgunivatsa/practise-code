package com.yash.jspservlet.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.jspservlet.domain.Employee;
import com.yash.jspservlet.service.CrudServiceImpl;
import com.yash.jspservlet.service.CrudServiceIntf;

 
@WebServlet("/CRUDServlet")
public class CRUDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("id");
		int employeeId= Integer.parseInt(id);
		String name=request.getParameter("name");
		String contact= request.getParameter("contact");
		String address=request.getParameter("address");
		String searchById= request.getParameter("searchById");
		
		Employee employee = new Employee();
		employee.setId(employeeId);
		employee.setName(name);
		employee.setContact(contact);
		employee.setAddress(address);
		
		CrudServiceIntf crudServiceIntf= new CrudServiceImpl();
		
		String buttonName= request.getParameter("choice");
		System.out.println("--------this is the choice -------------------");
		if (buttonName.equalsIgnoreCase("add")){
			System.out.println("-------------this is the add choice------------");
			crudServiceIntf.addEmployee(employee);
			}
		else if(buttonName.equalsIgnoreCase("search")){
			System.out.println("----------this is the search choice------------");
			if(searchById.equals("")){
			List employeeList= crudServiceIntf.showAllEmployee();
			
			}
			else {
			Employee showEmployee=crudServiceIntf.searchById(employee);
			request.setAttribute("showEmployee", showEmployee);
			request.getRequestDispatcher("/display.jsp").forward(request, response);
			}
		}
		else if (buttonName.equalsIgnoreCase("delete")){
			System.out.println("----------this is the delete choice------------");
			
			
		}
		else if(buttonName.equalsIgnoreCase("update")){
			System.out.println("----------this is the update choice------------");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
