package com.cdac.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dao.UserDao;
import com.cdac.entity.User;


public class App {
	
	public static void main(String[] args) {
		
		//Loading Spring /IOC Container
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-Spring-Config.xml");
		
		UserDao dao = (UserDao) ctx.getBean("userDao");
		
		User user = new User();
		
		user.setUsername("Credence");
		user.setPassword("Sachin@123");
		user.setEmail("sachinjadhav0308@gmail.com");
		
		dao.add(user);
		
	     }
		
	}
	


