package com.yash.servlet.sum;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String firstNumber=request.getParameter("firstnumber");
	int numberOne=Integer.parseInt(firstNumber);
	String secondNumber=request.getParameter("secondnumber");
	int numberTwo=Integer.parseInt(secondNumber);
	int intsum= numberOne+numberTwo;
	String sumOfTwoNumbers=Integer.toString(intsum);
	
	HttpSession session = request.getSession();
	session.setAttribute("SumOfFirstTwoNumbers", sumOfTwoNumbers);
	
	ServletContext application= getServletContext();
	application.getRequestDispatcher("/ShowResultServlet").forward(request, response);
	}
}
