package jdbc1;

import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		
		 try
		      {
		      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Sachin@123");
		         Statement st = conn.createStatement();
		       {		      
		          String sql = "CREATE TABLE REGISTRATION5(id INTEGER not NULL,first VARCHAR(255), last VARCHAR(255),age INTEGER,PRIMARY KEY ( id ))"; 

		         st.executeUpdate(sql);
		         System.out.println("Created table in given database..."); 
		         st.execute("desc REGISTRATION5");
		       }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		   }
		}