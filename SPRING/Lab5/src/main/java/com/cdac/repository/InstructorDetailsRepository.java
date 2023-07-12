package com.cdac.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdac.entity.InstructorDetails;

public interface InstructorDetailsRepository extends CrudRepository<InstructorDetails, Integer> {

	public List<InstructorDetails> findByCourse (String course);
	
	public List<InstructorDetails> findBySubjectTaken (String subjectTaken);
	
	public List<InstructorDetails> findById(int instrDetails_id);
}
