package com.cdac.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdac.entity.InstructorDetails;
import com.cdac.entity.InstructorEntity;

public interface InstructorEntityRepository extends CrudRepository<InstructorEntity, Integer> {

	public List<InstructorEntity> findByEmail (String email);
	
	public List<InstructorEntity> findByLastName (String lastName);
}
