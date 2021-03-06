package com.yash.jstl.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.jstl.domain.Helper;
import com.yash.jstl.domain.User;

/**
 * Servlet implementation class JstlServlet
 */
@WebServlet("/JsltServlet")
public class JstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setAddress(address);
		
		Helper helper=new Helper();
		helper.doProcess(user);
		
	}

}
