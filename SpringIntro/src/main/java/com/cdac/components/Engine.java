package com.cdac.components;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
	
	public void on() {
		System.out.println("Vroom Vroom");
	}
	
	public void off() {
		System.out.println("Phoosh Phoosh");
	}


}
