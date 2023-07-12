package com.cdac.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdac.entity.Bloodbank;

public interface BloodBankRepository extends CrudRepository<Bloodbank, Integer> {
	
	public List<Bloodbank> findBybloodBankName (String bloodBankName);
	
	public List<Bloodbank> findBybloodBankId (int bloodBankId);

}
