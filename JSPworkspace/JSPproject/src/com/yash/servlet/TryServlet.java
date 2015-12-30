package com.yash.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.domain.Customer;


@WebServlet("/TryServlet")
public class TryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String id=request.getParameter("id");
			String name=request.getParameter("name");
			String contact= request.getParameter("contact");
			String city=request.getParameter("city");
			String state=request.getParameter("state");
			String country=request.getParameter("country");
			
			
			Customer customer= new Customer();
			customer.setId(id);
			customer.setName(name);
			customer.setContact(contact);
			customer.address.setCity(city);
			customer.address.setCountry(country);
			customer.address.setPincode(pincode);
			
			request.setAttribute("customer", customer);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("SecondJSPFile.jsp");
			dispatcher.forward(request, response);
			
	}

}
