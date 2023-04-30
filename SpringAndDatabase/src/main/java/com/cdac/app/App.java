package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.spring.CarPart;
import com.cdac.spring.CarPartInventory;

public class App {
	
	public static void main(String[] args) {
		
		//Loading Spring /IOC Container
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-Spring-Config.xml");
		
	CarPartInventory inv = (CarPartInventory) ctx.getBean("carParts2");
		//SPRING IS USE TO CREATE INSTANCE OF THIS CLASS
		
		CarPart cp = new CarPart();
		// WE CREATE THIS INSTANCE 
		//MODEL AND ENTITY CLASSES ARE NOT INSTANCIATED WITH SPRING 
		//TYAMULE APAN CREATE KARTOY YAA CLASSES CHE OBJECT
		cp.setPartName("Dreak Pads");
		cp.setCarModel("SAFARI");
		cp.setPrice(1500);
		cp.setQuantity(12);
		
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
		
		
		
		
	}
	

}
