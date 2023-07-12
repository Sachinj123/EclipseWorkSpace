package com.cdac.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdac.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> 
{
	public List<Student> findByCollageName(String collageName);

}
