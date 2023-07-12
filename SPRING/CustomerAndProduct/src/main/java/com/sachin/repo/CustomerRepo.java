package com.sachin.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sachin.entities.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	public List<Customer> findByCustomerId (int custId);
	
	public List<Customer> findByCustomerName(String custname);
	
	public List<Customer> findByEmail(String email);
}
