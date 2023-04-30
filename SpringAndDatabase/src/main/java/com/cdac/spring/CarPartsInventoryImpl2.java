package com.cdac.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("carParts2")
public class CarPartsInventoryImpl2 implements CarPartInventory {

	@Autowired
	private DataSource dataSource;
	
	public void addNewPart(CarPart carPart) throws ClassNotFoundException {
		//IT IS THE INSERT QUERY 
		Connection conn = null;
		
		try {
			long ms1 = System.currentTimeMillis();
			
			
			 conn = dataSource.getConnection();
			 
			 long ms2 = System.currentTimeMillis();
			 System.out.println("Approx Time:"+(ms1-ms2)+"Millisecond");
			PreparedStatement st = conn.prepareStatement("insert into tbl_carpart(part_name,car_model,price,quantity) values(? ,? ,?, ?)");
			
			st.setString(1,carPart.getPartName());
			st.setString(2, carPart.getCarModel());
			st.setDouble(3, carPart.getPrice());
			st.setInt(4, carPart.getQuantity());
			
			st.executeUpdate();
			conn.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public List<CarPart> getAvailableParts() {
		// TODO Auto-generated method stub
		return null;
	}

}
