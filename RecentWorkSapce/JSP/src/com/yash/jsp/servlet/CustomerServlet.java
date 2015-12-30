package com.yash.jsp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.jsp.dao.CustomerDao;
import com.yash.jsp.domain.Customer;

@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	CustomerDao customerDao;
	Customer customer;
	List<Customer> customers;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 try {
    		 if (!request.getParameter("id").equalsIgnoreCase("")) {
    		 customer = customerDao.fetchById(request.getParameter("id"));
    		 request.setAttribute("customer", customer );
    		 request.getServletContext().getRequestDispatcher("/CustomerView.jsp")
    		 .forward(request, response);
    		 }else
    		 
    			 if (request.getParameter("id").equalsIgnoreCase("")){
    				 customers=(List<Customer>)customerDao.fetchAll();
    				 request.setAttribute("customers", customer);
    				 request.getServletContext().getRequestDispatcher("/CustomerView.jsp")
    				 .forward(request, response);
    			 }
    		 
     }	catch(Exception e){
    	 System.out.println(e.getMessage());
     }
}
}
