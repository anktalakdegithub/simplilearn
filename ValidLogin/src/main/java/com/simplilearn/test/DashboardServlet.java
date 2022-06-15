package com.simplilearn.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DashboardServlet
 */
@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	    response.setContentType("text/html");
   	    PrintWriter out=response.getWriter();
   	    HttpSession session=request.getSession();
   	    String name=(String)session.getAttribute("userss");
   	    String pass=(String)session.getAttribute("password");
   	    if(name!=null) {
   	    	out.print("Valid User Name is:"+name+" ");
   	    	out.print("<br> <a href='logout'>Logout</a>");
   	    }
   	    else
   	    {
   	    	out.print("Not Valid Details......Login First");
   	    }    
   	}
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
