package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.components.Car;
import com.cdac.components.CurrencyConverter;
import com.cdac.components.HelloWorld;
import com.cdac.components.LoginService;
import com.cdac.components.calculator;

public class App {
	
	public static void main(String[] args) {
		
		//Loading Spring /IOC Container
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-Spring-Config.xml");
		
		//Accessing a particular bean
		//1st class loading
		HelloWorld hw = (HelloWorld) ctx.getBean("hello");
		System.out.println(hw.sayHello("SACHIN"));
		
		//2nd class Loading
		System.out.println("CALCULATOR");
		calculator cal = (calculator) ctx.getBean("cal");
		
		System.out.println(cal.add(45, 18));
		
		System.out.println(cal.sub(45, 18));
		
		//3rd class Loading
		System.out.println("LOGIN SERVICE");
		LoginService ls = (LoginService) ctx.getBean("loginServ");
		
		System.out.println(ls.isValidUser("Sachin", "Sachin@123"));
		
		System.out.println("CURRENCY CONVERTER");
		
		CurrencyConverter CC = (CurrencyConverter) ctx.getBean("ConConverter");
		System.out.println(CC.convert("USD", "INR", 650));
		
		System.out.println("CAR CLASS");
		System.out.println();
		Car c = (Car) ctx.getBean("car");
		c.drive();
		
	}

}
