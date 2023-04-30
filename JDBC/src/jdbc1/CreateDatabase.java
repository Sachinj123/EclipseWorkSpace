package jdbc1;

import java.sql.*;

public class CreateDatabase {

	public static void main(String[] args) {
		
		 try
		      {
		      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Sachin@123");
		         Statement st = conn.createStatement();
		       {		      
		          String sql = "create database "; 

		         st.executeUpdate(sql);
		         System.out.println("Created database..."); 
		       }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		   }
		}
