package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.InstructorDetails;
import com.cdac.entity.InstructorEntity;
import com.cdac.repository.InstructorDetailsRepository;
import com.cdac.repository.InstructorEntityRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class InstructorService {

	@Autowired
	private InstructorEntityRepository instructorEntityRepository;
	
	@Autowired
	private InstructorDetailsRepository instructorDetailsRepository;
	
	public void saveInstructorEntity(InstructorEntity istructorEntity)
	{
		instructorEntityRepository.save(istructorEntity);
		
	}
	
	public void saveInstructorDetails(InstructorDetails instructorDetails)
	{
		instructorDetailsRepository.save(instructorDetails);
	}
	
	public InstructorEntity fetchEntity(int instructor_id)
	{
		return instructorEntityRepository.findById(instructor_id).get();
	}
	

}

