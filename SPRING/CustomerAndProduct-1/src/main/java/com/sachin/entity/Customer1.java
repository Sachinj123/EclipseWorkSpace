package com.sachin.entity;

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
@Table(name = "tbl_cust")

@Getter
@Setter

public class Customer1 {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int customerId;
	
	
	private String customerName;
	
	private LocalDate dateOfBirth;
	
	private String customerAddress;
	
	@Email
	private String customerEmail;
	
	
	
	private String customerPassword;
	

	private String customerAbout;
	
	private Gender gender;
	public static enum Gender
	{
		MALE,FEMALE,OTHER
	}
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.PERSIST)
	private List<Product1> product;
}
