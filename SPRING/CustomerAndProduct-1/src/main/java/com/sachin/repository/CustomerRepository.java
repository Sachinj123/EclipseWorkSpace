package com.sachin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sachin.entity.Customer1;

public interface CustomerRepository extends CrudRepository<Customer1, Integer>{
	
	public List<Customer1> findByCustomerId (int custId);
	
	public List<Customer1> findByCustomerName(String custname);
	
	public List<Customer1> findByEmail(String email);

}
