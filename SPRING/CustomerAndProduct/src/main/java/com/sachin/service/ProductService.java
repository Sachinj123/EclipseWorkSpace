package com.sachin.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sachin.entities.Product;
import com.sachin.repo.ProductRepo;

public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	public void saveProduct(Product product)
	{
		productRepo.save(product);
	}
	
	public void deleteProduct(int id)
	{
		productRepo.deleteById(id);
	}
	
	public Product fetchProduct(int id)
	{
		return productRepo.findById(id).get();
	}

}
