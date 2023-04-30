package com.cdac.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;


@Component("carParts1")
public class CarPartsInventoryImpl1 implements CarPartInventory {

	public void addNewPart(CarPart carPart) {
		//IT IS THE INSERT QUERY 
		//Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Sachin@123");
			PreparedStatement st = conn.prepareStatement("insert into tbl_carpart(part_name,car_model,price,quantity) values(? ,? ,?, ?)");
			
			st.setString(1,carPart.getPartName());
			st.setString(2, carPart.getCarModel());
			st.setDouble(3, carPart.getPrice());
			st.setInt(4, carPart.getQuantity());
			
			st.executeUpdate();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public List<CarPart> getAvailableParts() {
		// TODO Auto-generated method stub
		return null;
	}

}
