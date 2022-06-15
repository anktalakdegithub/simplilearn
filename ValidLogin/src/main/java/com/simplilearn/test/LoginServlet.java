package com.simplilearn.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String users=request.getParameter("user");
	  String pass=request.getParameter("pass");
	  PrintWriter out=response.getWriter();
	  if(pass.equals("admin") && users.equals("Ankita")) {
		  out.print("Succesfully Login....");
        // For Session
		  HttpSession session=request.getSession();
		  session.setAttribute("userss", users);
		  session.setAttribute("password", pass);
		  response.sendRedirect("dashboard");
	  }
	  else {
		  out.print("Wrong Username and PAssword");
	  }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
