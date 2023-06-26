package com.school.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.School;
import com.school.entity.School.SchoolType;
import com.school.entity.Student;
import com.school.entity.Student.Gender;

// http://localhost:8080/school-details?SchoolId=12345

@RestController
public class SchoolController {
	
	@RequestMapping("school")
	public School getStudentDetails(@RequestParam("scId") int SchoolId)
	{
		School school = new School();
		
		school.setSchoolName("Shivaji Vidyalaya");
		school.setSchoolAddress("Cidco Nanded");
		school.setSchoolType(SchoolType.SSC);
		school.setSchoolId(SchoolId);
		
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setName("Sachin");
		s1.setAddress("Vishnpuri");
		s1.setGender(Gender.MALE);
		s1.setStandard(10);
		s1.setDateOfBirth(LocalDate.of(2012, 5, 15));
		
		list.add(s1);
		
		school.setStudent(list);
		return school;
		
	}

}
