package com.sachin.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_pers")
public class Product1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	@NotNull
	private String productName;
	@NotEmpty
	private float productPrice;
	@NotNull
	private String productInfo;
	
	@ManyToOne
	//Foreign key
	@JoinColumn(name = "cust_id")
	private Customer1 customer;
}
