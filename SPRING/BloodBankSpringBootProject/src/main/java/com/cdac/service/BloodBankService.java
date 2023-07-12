package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.Bloodbank;
import com.cdac.repository.BloodBankRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BloodBankService {

	@Autowired
	private BloodBankRepository bloodBankRepository;
	
	
	public void saveBloodBank(Bloodbank bloodBank)
	{
		bloodBankRepository.save(bloodBank);
	}
	
	public Bloodbank fetchBloodBank(int bloodBankId)
	{
		return bloodBankRepository.findById(bloodBankId).get();
	}
	
	public void deleteBloodBank(int bloodBankId)
	{
		bloodBankRepository.deleteById(bloodBankId);
	}
}
