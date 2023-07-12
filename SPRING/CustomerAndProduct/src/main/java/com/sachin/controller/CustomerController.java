package com.sachin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.entities.Customer;
import com.sachin.repo.CustomerRepo;
import com.sachin.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/add-customer")
	public String addCustomer(@RequestBody Customer customer)
	{
		customerService.saveCustomer(customer);
		return "Customer Added Sucessfully";
	}
}
