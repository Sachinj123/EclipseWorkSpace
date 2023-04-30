package com.cdac.components;

import org.springframework.stereotype.Component;

@Component("ConConverter")

public class CurrencyConverter {
	
	public double convert(String from,String to,double amount) {
		
		if(from.equals("USD") && to.equals("INR")) {
			return 78.59*amount;
		}
		
		else if(from.equals("GBP") && to.equals("INR")) {
			return 94.41*amount;
		}
		
		else
			return 0;
		
		
	}

}
