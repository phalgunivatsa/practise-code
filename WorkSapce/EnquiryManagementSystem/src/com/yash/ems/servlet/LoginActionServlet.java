package com.yash.ems.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ems.dao.CrudOperations;

@WebServlet("/LoginActionServlet")
public class LoginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext application = getServletContext();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		CrudOperations crudOperation = new CrudOperations();
		boolean result = crudOperation.validateUser(username, password);

		if (result = true) {
			application.getRequestDispatcher("").forward(request, response);
		} else {
			application.getRequestDispatcher("/login.jsp").forward(request,
					response);
			;
		}

	}

}
