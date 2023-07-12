package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.Library;
import com.cdac.entity.Student;
import com.cdac.repository.LibraryRepository;
import com.cdac.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LibraryAndStudentService {
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void saveLibrary(Library library)
	{
		libraryRepository.save(library);
	}
	
	public void saveStudent(Student student)
	{
		studentRepository.save(student);
	}
	
	public Library fetchLibrary(int libraryId)
	{
		return libraryRepository.findById(libraryId).get();
	}
	
	public Student fetchStudent(int studentId)
	{
		return studentRepository.findById(studentId).get();
	}
	
	public void deleteLibrary(int libraryId)
	{
		libraryRepository.deleteById(libraryId);
	}
	
	public void deleteStudent(int studentId)
	{
		studentRepository.deleteById(studentId);
	}

}
