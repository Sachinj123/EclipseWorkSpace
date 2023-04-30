package com.cdac.Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterStudent {
	public boolean isStudentPresent(String email) {
		 Connection conn = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Sachin@123");
				 boolean Present = false;
				 
				 PreparedStatement pst = conn.prepareStatement("select count(*) from student where email=?");
				 
				 pst.setString(1, email);
				 ResultSet rs = pst.executeQuery();
				 if(rs.next()) {
					 int c = rs.getInt(1);
					 if(c==1) {
						Present = true;
					 }
					 return Present;
				 }
				 
		
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
				
			} 
				
		finally {
				try { conn.close();}catch (Exception e) {}
			
		}
			return false;
			
			
}
	 public void student(int id,String name,String email,int mobileNo,String password,String username) {
		 
		 Connection conn = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Sachin@123");
				 
				 
				 PreparedStatement st = conn.prepareStatement("insert into student (id,name,email,mobileno,username,password) values(?,?,?,?,?,?)");
				 
				 st.setInt(1, id);
				 st.setString(2,name);
				 st.setString(3,email);
				 st.setInt(4, mobileNo);
				 st.setString(5,username);
				 st.setString(6,password);
				 st.executeUpdate();
				
				 
				 
		
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
				
			} 
			finally {
				try {conn.close();}catch (Exception e) {
					
				}
			}
		 
		 
	 }
	
	 
	


}
