package com.cdac;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sachin.entities.Customer;
import com.sachin.entities.Customer.Gender;
import com.sachin.repo.CustomerRepo;
import com.sachin.repo.ProductRepo;

@SpringBootTest
class CustomerAndProductApplicationTests {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@Test
	void addCustomer() 
	{
		Customer c = new Customer();
		c.setCustomerName("Sachin Jadhav");
		c.setDateOfBirth(LocalDate.of(1997, 06, 25));
		c.setCustomerAddress("Nanded");
		c.setCustomerEmail("sachinjadhav0308@gmail.com");
		c.setCustomerPassword("Sachin@123");
		c.setCustomerAbout("Engineer");
		c.setGender(Gender.MALE);
		
		customerRepo.save(c);
		
		
	}

}
