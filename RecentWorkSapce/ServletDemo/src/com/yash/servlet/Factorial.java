package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Factorial")
public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Factorial() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printwriter= response.getWriter();
		int sum=1;
		for(int i=1;i<8;i++){
			sum=sum*i;
		}
		printwriter.print(sum);
	}

}
