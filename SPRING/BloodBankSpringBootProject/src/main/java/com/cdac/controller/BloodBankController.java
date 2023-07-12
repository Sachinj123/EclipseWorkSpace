package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Bloodbank;
import com.cdac.repository.BloodBankRepository;
import com.cdac.service.BloodBankService;
import com.cdac.service.UserService;

@RestController
public class BloodBankController {

	@Autowired
	private BloodBankService bloodBankService;
	
	@Autowired
	private BloodBankRepository bloodBankRepository;
	
	@PostMapping("/add-bloodbank")
	//In add blood bank openat and closeat gives error therefore we didnt add from POSTMAN for Ahilya Blood Bank
	public String addBloodBank(@RequestBody Bloodbank bb)
	{
		bloodBankService.saveBloodBank(bb);
		return "Blood Bank Added SuccessFully !!";
	}
	
	@PutMapping("/update-bloodbank")
	public String updateBloodBank(@RequestBody Bloodbank bb)
	{
		bloodBankService.saveBloodBank(bb);
		return "BloodBank Details Update Successfully!! ";
	}
	
	@DeleteMapping("/delete-bloodbank")
	public String deleteBloodBank(@RequestParam("bloodBankId") int bloodBankId)
	{
		bloodBankService.deleteBloodBank(bloodBankId);
		return "BloodBank Deleted Successfully !!";
	}
	
	@GetMapping("/select-bloodbank")
	public void getBloodBankDetails(@RequestParam("bloodBankId") int bloodBankId)
	{
		bloodBankService.fetchBloodBank(bloodBankId);
		
	}
	

}
