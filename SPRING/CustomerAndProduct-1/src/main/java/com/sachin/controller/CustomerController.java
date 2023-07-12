package com.sachin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.entity.Customer1;
import com.sachin.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/add-cust")
	public String addCustomer(@RequestBody Customer1 cust)
	{
		customerService.saveCustomer(cust);
		return "Customer Added Successfully";
		
	}
}
