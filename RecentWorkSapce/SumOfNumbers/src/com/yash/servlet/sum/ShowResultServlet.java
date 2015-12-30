package com.yash.servlet.sum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShowResultServlet")
public class ShowResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html>");
		printWriter.println("<body>");

		HttpSession session = request.getSession();
		int finalSum = (Integer) session.getAttribute("SumOfFirstTwoNumbers");
		int numberThree = 0;
		if (request.getParameter("thirdNumber") != null) {
			System.out.println(request.getParameter("thirdNumber"));
			numberThree = Integer.parseInt(request.getParameter("thirdNumber"));
			finalSum = finalSum + numberThree;
			session.setAttribute("finalSum", finalSum);
		} else {
			session.setAttribute("finalSum", finalSum);
		}

		printWriter.println("'<h1>The final value is'" + finalSum + "'</h1>'");
		printWriter.print("<br/><form method='get' action='SumServlet'>");
		printWriter
				.println("<br/>Enter the third value<input type='text' name='thirdNumber'/>");
		printWriter
				.println("<br/><input type='submit' name='sum' value='Add'/>");
		printWriter.print("<br/><form>");

		printWriter.println("</body>");
		printWriter.println("</html>");

	}
}
