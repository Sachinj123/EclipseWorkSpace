package com.cdac.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Student1")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	private String Name;
	private String collageName;
	private LocalDate dateOfBirth;
	private LocalDate returnDate;
	private String gender;
	
	@ManyToOne
	@JoinColumn(name="library_id")
	private Library library;
	
	
	

}
