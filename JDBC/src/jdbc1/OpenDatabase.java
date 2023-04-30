package jdbc1;

import java.sql.*;

public class OpenDatabase {

	public static void main(String[] args) {
		System.out.println("Connecting to a selected database...");
		 try
		      {
		      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Sachin@123");
		         Statement st = conn.createStatement();
		       {		      
		          
		    	   System.out.println("Inserting records into the table...");          
		           String sql = "INSERT INTO employee values(100, 'Zara', 5000, 'abc',12)";
		           st.executeUpdate(sql);
		          
		          
		           System.out.println("Inserted records into the table..."); 
		       }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		   }
		}