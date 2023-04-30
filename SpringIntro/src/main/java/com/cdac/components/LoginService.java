package com.cdac.components;

import org.springframework.stereotype.Component;

@Component("loginServ")

public class LoginService {
	
	public boolean isValidUser(String username,String password) {
		if(username.equals("Sachin") && password.equals("Sachin@123"))
		{
			return true;
		}
			
		return false;
	}

}
