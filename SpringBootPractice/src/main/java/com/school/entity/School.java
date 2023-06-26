package com.school.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class School {
	
	private String SchoolName;
	private String SchoolAddress;
	private SchoolType schoolType;
	private int SchoolId;
	
	public static enum SchoolType{
		SSC,HSC,CBSC,ICSC;
	}
	
	List<Student> student;

}
