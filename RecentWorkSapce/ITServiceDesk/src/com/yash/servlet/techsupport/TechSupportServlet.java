package com.yash.servlet.techsupport;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.server.util.ConnectionProvider;
import com.yash.servlet.domain.Problem;
import com.yash.servlet.domain.User;

@WebServlet("/TechSuppportServlet")
public class TechSupportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TechSupportServlet() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		HttpSession httpsession;
		Connection connection = ConnectionProvider.getConnection();
		String userid = request.getParameter("userName");
		String query = "SELECT USERID FROM USER WHERE USERID=?";
		String usrId = null;
		User user = null;
		Problem problem=null;
		
		try {

			ResultSet resultSet = DbSelectCrud.getUsrId(uId);
			System.out.println(resultSet);
			System.out.println(resultSet);
			while (resultSet.next()) {
			usrId = resultSet.getString(1);
			}
			if (userid.equalsIgnoreCase(usrId)) {
			request.setAttribute("userId", request.getParameter("userName"));
			httpsession = request.getSession(true);
			user = DbSelectCrud.getUser(userid);
			httpsession.setAttribute("user", user);
			problem = new Problem();
			problem.setUserId(userid);
			System.out.println(userId);
			problem.setSoftware(request.getParameter("software"));
			System.out.println(request.getParameter("software"));
			problem.setOs(request.getParameter("os"));
			System.out.println(request.getParameter("os"));
			problem.setDescription(request.getParameter("description"));
			System.out.println(request.getParameter("description"));
			DbSelectCrud.updateProblem(problem);
			request.getServletContext()
			.getRequestDispatcher("/ResponseServlet")
			.forward(request, response);

			} else {
			request.setAttribute("userId", request.getParameter("userName"));
			httpsession = request.getSession(true);
			httpsession.setAttribute("UserId", uId);
			problem = new Problem();
			problem.setUserId(userid);
			System.out.println(uId);
			problem.setSoftware(request.getParameter("software"));
			System.out.println(request.getParameter("software"));
			problem.setOs(request.getParameter("os"));
			System.out.println(request.getParameter("os"));
			problem.setDescription(request.getParameter("description"));
			System.out.println(request.getParameter("description"));
			DbSelectCrud.updateProblem(problem);
			request.getServletContext()
			.getRequestDispatcher("/RegisterUser.html")
			.forward(request, response);

			}

			} catch (Exception e) {
			e.printStackTrace();

			}

	}
}
