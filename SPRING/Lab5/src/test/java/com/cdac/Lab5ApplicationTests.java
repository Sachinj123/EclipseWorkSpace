package com.cdac;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cdac.entity.InstructorDetails;
import com.cdac.entity.InstructorEntity;
import com.cdac.repository.InstructorDetailsRepository;
import com.cdac.repository.InstructorEntityRepository;

@SpringBootTest
class Lab5ApplicationTests {

	@Autowired
	private InstructorEntityRepository instructorEntityRepository;
	
	@Autowired
	private InstructorDetailsRepository instructorDetailsRepository;
	
	@Test
	void addInstructorEntity() 
	{
		InstructorEntity entity = new InstructorEntity();
		entity.setFirstName("Sunitha");
		entity.setLastName("C.S");
		entity.setEmail("sunitha.cs@gmail.com");
		instructorEntityRepository.save(entity);
	}
	
	@Test
	void addInstructorDetails()
	{
		InstructorEntity entity = instructorEntityRepository.findById(1).get();
		
		InstructorDetails details = new InstructorDetails();
		details.setCourse("PG-DAC");
		details.setSubjectTaken("Java");
		details.setInstructorEntity(entity);
		instructorDetailsRepository.save(details);
	}

	@Test
	void fetchByEmail()
	{
		List<InstructorEntity> list =(List<InstructorEntity>) instructorEntityRepository.findByEmail("sunitha.cs@gmail.com");
		for(InstructorEntity entity : list)
		{
			System.out.println("Id :"+entity.getInstructor_id()+" FirstName : "+entity.getFirstName()+" LastName : "+entity.getLastName());
		}
	}
	
	@Test
	void fetchByCourse()
	{
		List<InstructorDetails> list = instructorDetailsRepository.findByCourse("PG-DAC");
		for(InstructorDetails details : list)
		{
			System.out.println("SubjectTaken :"+details.getSubjectTaken()+" "+"Course :"+details.getCourse());
		}
	}
	
	
}
