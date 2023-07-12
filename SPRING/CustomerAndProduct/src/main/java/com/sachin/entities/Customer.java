package com.sachin.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_Customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int customerId;
	
	@NotEmpty
	private String customerName;
	
	private LocalDate dateOfBirth;
	@NotNull
	private String customerAddress;
	
	@Email
	private String customerEmail;
	
	@NotNull
	@Size(min =5, max =15,message = "Password must be minimum of 5 characters and maximum of 15 charachters !!!" )
	private String customerPassword;
	
	@NotNull
	private String customerAbout;
	
	private Gender gender;
	public static enum Gender
	{
		MALE,FEMALE,OTHER
	}
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.PERSIST)
	private List<Product> product;
}
