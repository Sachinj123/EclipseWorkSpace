package com.cdac.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Library")
public class Library {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int libraryId;
	private String libraryName;
	private String address;
	private BookType booktype;
	private LocalDate issueDate;
	
	public static enum BookType
	{
		SOM,TOM,HT,TD,JAVA,DSA,MD;
	}
	
	@OneToMany(mappedBy = "library", cascade = CascadeType.PERSIST)
	private List<Student> student;

}
