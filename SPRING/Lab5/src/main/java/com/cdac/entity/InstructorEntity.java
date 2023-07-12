package com.cdac.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="tblEntity")
public class InstructorEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int instructor_id;
	
	private String firstName;
	private String lastName;
	private String email;
	
	@OneToOne
	(mappedBy = "instructorEntity", cascade = CascadeType.PERSIST)
	private InstructorDetails instructorDetails;
	

}
