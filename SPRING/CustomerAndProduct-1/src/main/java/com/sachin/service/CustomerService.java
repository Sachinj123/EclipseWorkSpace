package com.sachin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.entity.Customer1;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerService customerService;
	
	public void saveCustomer(Customer1 cust)
	{
		customerService.saveCustomer(cust);
	}

}
