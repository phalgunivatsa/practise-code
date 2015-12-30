package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Fibonacci")
public class Fibonacci extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Fibonacci() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printwriter=response.getWriter();
		int one=1;
		int zero=0;
		int fib=0;
		for(int i=1;i<10;i++){
			fib=one+zero;
			zero=one;
			one=fib;
			printwriter.println(fib+",");
		}
	}

}
