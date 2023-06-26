package com.cdac.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Bank;
import com.cdac.entity.User;
import com.cdac.entity.User.AccountType;
import com.cdac.entity.User.Gender;

//http://localhost:8080/bank-details?IFSC_Code=12345

@RestController
public class BankController {
	
	@RequestMapping("bank-details")
	public Bank getDetails(@RequestParam("IFSC_Code") int IFSC_Code)
	{
		Bank bank = new Bank();
		
		bank.setName("Bank of India");
		bank.setAddress("Vishnupuri");
		bank.setIFSC_Code(IFSC_Code);
		
		List<User> list = new ArrayList<>();
		
		User u1 = new User();
		u1.setUserName("Sampada");
		u1.setAccountNo(123456789);
		u1.setDateofbirth(LocalDate.of(2000, 3, 29));
		u1.setUserAddress("Pune");
		u1.setGender(Gender.FEMALE);
		u1.setAccountType(AccountType.SAVINGS);
		
		list.add(u1);
		
		User u2 = new User();
		u1.setUserName("Vishnu");
		u1.setAccountNo(75395123);
		u1.setDateofbirth(LocalDate.of(2005, 7, 12));
		u1.setUserAddress("Panvel");
		u1.setGender(Gender.MALE);
		u1.setAccountType(AccountType.CURRENT);
		list.add(u2);
		
		bank.setUser(list);
		return bank;
		
	}
	

}
