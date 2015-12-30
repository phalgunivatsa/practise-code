package com.yash.techsupportservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ResponseServlet")
public class ResponseServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       
  @Override
protected void service(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
PrintWriter printWriter = response.getWriter();
HttpSession session = request.getSession(true);
request.getServletContext().getRequestDispatcher("/Header.html").include(request, response);
try {
//printWriter.print("<div > <header>  <h1>Successfully Submitted Problem</h1>'"+DbSelectCrud.getUser((String)(session.getAttribute("user")))+"'  </header>  </div>");
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
request.getServletContext().getRequestDispatcher("/Footer.html").include(request, response);
 
 
  }

}
