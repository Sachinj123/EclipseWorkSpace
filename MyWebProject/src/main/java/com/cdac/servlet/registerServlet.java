package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register.cdac")
public class registerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int mobileNo = Integer.parseInt(request.getParameter("mobileNo"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Sachin@123");
			PreparedStatement st = conn.prepareStatement("insert into register(name,email,mobileno,username,password) values(? ,? ,?, ?, ?)");
			
			st.setString(1, name);
			st.setString(2, email);
			st.setInt(3, mobileNo);
			st.setString(4, username);
			st.setString(5, password);
			st.executeUpdate();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
		 PrintWriter out = response.getWriter();
		 out.write("<html><body>");
		 out.write("<h1>Registration Successful !</h1>");
		 out.write("</html></body>");
		
	}

	

}
