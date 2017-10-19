package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname= request.getParameter("username");
		String pass= request.getParameter("passwd");
		String em= request.getParameter("email");
		
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		
		pw.println("<html>");
		pw.println("<body style='color:green'>");
		
		pw.println("Your usrname is: "+uname);
		pw.println("<br>Your password is: "+pass);
		pw.println("<br>Your email id is: "+em);
		pw.println("<br>Your Ip Adress is: "+request.getRemoteAddr());
	}

}
