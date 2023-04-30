package com.cdac.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee")

public class Employee {
	@Id  //primary key apply 
	
	@Column(name="emp_no")
	private int empno;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_salary")
	private double salary;
	
	@Column(name="date_Of_Joining")
	private LocalDate dateOfJoining;
	
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	

	
}
