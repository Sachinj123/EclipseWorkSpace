package com.cdac;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_InstuctorEntity")

public class InstructorEntity {
	
	
	@Id    //------>It is used for applying primary key to the field
	@GeneratedValue (strategy = GenerationType.IDENTITY)  //-----> It is used for the id is
	                                                                                                       //auto_incremented
	
	private int instuc_id;
	private String FirstName;
	private String LastName;
	private String email;
	
	@OneToOne(mappedBy = "instentity",cascade = CascadeType.PERSIST )
	
	private InstructorDetails instdetails;
	
	
	public int getInstuc_id() {
		return instuc_id;
	}
	
	public void setInstuc_id(int instuc_id) {
		this.instuc_id = instuc_id;
	}
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public InstructorDetails getInstdetails() {
		return instdetails;
	}
	
	public void setInstdetails(InstructorDetails instdetails) {
		this.instdetails = instdetails;
	}
	
	

}
