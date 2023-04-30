package com.cdac.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.spring.CarPart;
import com.cdac.spring.CarPartInventory;

public class App {
	
	public static void main(String[] args) {
		
		//Loading Spring /IOC Container
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-Spring-Config.xml");
		
	CarPartInventory inv = (CarPartInventory) ctx.getBean("carParts3");
		//SPRING IS USE TO CREATE INSTANCE OF THIS CLASS
		
		CarPart cp = new CarPart();
		// WE CREATE THIS INSTANCE 
		//MODEL AND ENTITY CLASSES ARE NOT INSTANCIATED WITH SPRING 
		//TYAMULE APAN CREATE KARTOY YAA CLASSES CHE OBJECT
		cp.setPartName("Flash Light");
		cp.setCarModel("Hector ++");
		cp.setPrice(650);
		cp.setQuantity(22);
		
		long ms1 = System.currentTimeMillis();
		try
		{
			
			inv.addNewPart(cp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long ms2 = System.currentTimeMillis();
		System.out.println("Total Time:"+(ms2-ms1)+"Millisecond");
		
		
			List<CarPart> list = inv.getAvailableParts();
			for(CarPart carPart : list)
				System.out.println(carPart);
			
		}
		
		
		
		
	}
	


