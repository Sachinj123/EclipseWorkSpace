package com.cdac.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_BloodBank")
public class Bloodbank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bloodBankId;
	
	private String bloodBankName;
	private String emailId;
	private LocalTime openAt;
	private LocalTime closeAt;
	private LocalDate registeredOn;
	
	@OneToMany(mappedBy = "bloodBank", cascade = CascadeType.PERSIST)
	private List<User> user;
}
