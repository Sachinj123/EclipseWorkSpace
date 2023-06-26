package com.school.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
	
	private String Name;
	private String Address;
	private int Standard;
	
	private Gender gender;
	private LocalDate dateOfBirth;
	
	public static enum Gender{
		MALE,FEMALE,OTHER;
	}
	
	

}
