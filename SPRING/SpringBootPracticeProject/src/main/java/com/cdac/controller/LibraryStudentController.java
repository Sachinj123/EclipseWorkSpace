package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Library;
import com.cdac.entity.Student;
import com.cdac.service.LibraryAndStudentService;

@RestController
public class LibraryStudentController {
	
	@Autowired
	private LibraryAndStudentService libraryAndStudentService;
	
	@PostMapping("/add-library")
	public String addLibrary(@RequestBody Library library)
	{
		libraryAndStudentService.saveLibrary(library);
		return "Library Added Successfully !!!";
		
	}
	
	@PostMapping("/add-student")
	public String addStudent(@RequestBody Student student)
		{
			libraryAndStudentService.saveStudent(student);
			return "Student Added Successfully !!!";
		}
	
	@PutMapping("/update-library")
	public String updateLibrary(@RequestBody Library library)
	{
		libraryAndStudentService.saveLibrary(library);
		return "Library Details Updated Successfully!!";
	}
	
	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student student)
	{
		libraryAndStudentService.saveStudent(student);
		return "Student Details Updated Successfully!!";
	}
	
	@DeleteMapping("/delete-library")
	public String deleteLibrary(@RequestParam ("libraryId") int libraryId)
	{
		libraryAndStudentService.deleteLibrary(libraryId);
		return "Library Deleted Successfully !!";
	}
	
	@DeleteMapping("/delete-song")
	public String deleteStudent(@RequestParam ("studentId") int studentId)
	{
		libraryAndStudentService.deleteStudent(studentId);
		return "Student Deleted Successfully !!";
		
	}
	

}
