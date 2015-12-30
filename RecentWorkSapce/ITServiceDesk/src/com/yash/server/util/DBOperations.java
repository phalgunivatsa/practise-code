package com.yash.techsupportservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.dbutil.DbSelectCrud;
import com.yash.domain.User;


@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
HttpSession session;
@Override
protected void service(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
User user = new User();
session = request.getSession(true);
PrintWriter printWriter = response.getWriter();
user.setUserId((String)session.getAttribute("UserId"));
user.setFisrtName((String) request.getParameter("firstName"));
user.setLastName((String) request.getParameter("lastName"));
user.setContact(Integer.parseInt(request.getParameter("contact")));
try {
DbSelectCrud.updateUser(user);
request.getServletContext()
.getRequestDispatcher("/ResponseServlet")
.forward(request, response);
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}