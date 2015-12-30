package com.yash.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ajax.dao.CrudOperations;
import com.yash.ajax.domain.User;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Servlet");
		

		CrudOperations crudOperation = new CrudOperations();
		User user = new User();
		out.println("id:"+user.getUserId());
		out.println("name"+user.getName());
		out.println("id:"+user.getUserId());
		out.println("id:"+user.getUserId());
	}

}
