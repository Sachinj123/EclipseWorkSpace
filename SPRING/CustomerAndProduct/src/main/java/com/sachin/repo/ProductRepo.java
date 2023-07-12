package com.sachin.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sachin.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {

	public List<Product> findByProductId(int productId);
	
	public List<Product> findByProductName(String name);
}
