package com.sachin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.entities.Customer;
import com.sachin.repo.CustomerRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public void saveCustomer(Customer customer)
	{
		customerRepo.save(customer);
	}

	public void deleteCustomer(int id)
	{
		customerRepo.deleteById(id);
	}
	
	public Customer fetchCustomer(int id)
	{
		return customerRepo.findById(id).get();
	}

}
