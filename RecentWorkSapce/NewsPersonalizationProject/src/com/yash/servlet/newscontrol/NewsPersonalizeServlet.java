package com.yash.servlet.newscontrol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NewsPersonalizeServlet")
public class NewsPersonalizeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printwriter=response.getWriter();
		ServletContext application= getServletContext();
		String newsToPersonalize= request.getParameter("news");
		Cookie cookie=new Cookie("cNews", newsToPersonalize);  
		cookie.setMaxAge(60);
		response.addCookie(cookie);
		response.sendRedirect("NewsServletController");
	}

}
