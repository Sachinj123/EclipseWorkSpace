package com.sachin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.sachin.entity.Product1;

public interface ProductRepository extends CrudRepository<Product1, Integer> {
	
public List<Product1> findByProductId(int productId);
	
	public List<Product1> findByProductName(String name);

}
