package com.cdac.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello.everyone")
	public String sayHello()
	{
		return "Welcome to the world of Spring Boot ";
		//it will goes in the string format not in JSON format
		
	}

}
