package com.cdac.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.Register.RegisterStudent;


@WebServlet("/register.cdac")
public class RegisterServlet2 extends HttpServlet {

       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int mobileNo = Integer.parseInt(request.getParameter("mobileNo"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		 out.write("<html><body>");
				 
		 RegisterStudent regstd = new RegisterStudent();
		 
		 boolean present = regstd.isStudentPresent(email);
		 
		 if(present)
			 
			 out.write("<h1>You are Already Present</h1>");
		 
		 else {
			 regstd.student(id, name, email, mobileNo, password, username);
			 
			 out.write("<h1>You are Resiter Sucessful</h1>");
		 }
		 out.write("</body></html>");
		
	}

	
	

}
