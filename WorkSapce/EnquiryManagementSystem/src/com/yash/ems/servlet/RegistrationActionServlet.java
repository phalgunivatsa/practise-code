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
import com.yash.ems.domain.User;

@WebServlet("/RegistrationActionServlet")
public class RegistrationActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext application = getServletContext();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String emailId = request.getParameter("emailId");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int type = Integer.parseInt(request.getParameter("type"));
		int status = Integer.parseInt(request.getParameter("status"));

		User user = new User();

		user.setEmailId(emailId);
		user.setName(name);
		user.setPassword(password);
		user.setUsername(username);
		user.setStatus(status);
		user.setType(type);

		CrudOperations crudOperation = new CrudOperations();
		boolean result = crudOperation.registerUser(user);

		if (result = true) {
			application.getRequestDispatcher("/Enquiry.jsp").forward(request, response);
		}

	}

}
