package com.cdac.Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.Register.RegisterStudent;

@WebServlet("/register2.cdac")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id =Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int mobileNo =Integer.parseInt(request.getParameter("mobileNo"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		out.write("<html><body>");
		RegisterStudent rstudent = new RegisterStudent();
		boolean present = rstudent.isStudentPresent(email);
		if(present) {
			out.write("<h1>You are already a Registered Student</h1>");
			
		}
		else {
			rstudent.student(id, name, email, mobileNo, password, username);
			out.write("<h1> Registration Successful !!</h1>");
			
			out.write("</body></html>");
		}
		
	}

}
