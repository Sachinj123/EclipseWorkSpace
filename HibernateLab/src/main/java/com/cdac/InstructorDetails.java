package com.cdac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "tbl_InstuctorDetails")

public class InstructorDetails {
	
	@Id  //------>It is used for applying primary key to the field
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //-----> It is used for the id is
                                                                                                         //auto_incremented
	
	private int id;
	
	private String Sub_Taken;
	private String Courses;
	
	@OneToOne
	@JoinColumn(name="instructor_id")
	
	
	private InstructorEntity instentity;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSub_Taken() {
		return Sub_Taken;
	}

	public void setSub_Taken(String sub_Taken) {
		Sub_Taken = sub_Taken;
	}

	public String getCourses() {
		return Courses;
	}

	public void setCourses(String courses) {
		Courses = courses;
	}

	public InstructorEntity getInstentity() {
		return instentity;
	}

	public void setInstentity(InstructorEntity instentity) {
		this.instentity = instentity;
	}
	
	
	

}
