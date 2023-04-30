package com.cdac;

import java.util.Scanner;

class Employee{
	
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private String department;
    private int empid;
	private String designation;
	private float salary;
	

	public Employee() {
		super();
		this.name = name;
		this.department = department;
		this.empid = empid;
		this.designation = designation;
		this.salary = salary;
	}
public void acceptRecord(Employee emp) {
		
		System.out.println("Employee Name: ");
		sc.nextLine();
		this.name=sc.nextLine();
		System.out.println("Employee Department: ");
		sc.nextLine();
		this.department=sc.nextLine();
		System.out.println("Employee EmpId: ");
		this.empid= sc.nextInt();
		System.out.println("Employee Designation: ");
		sc.nextLine();
		this.designation=sc.nextLine();
		System.out.println("Employee Salary: ");
		this.salary=sc.nextFloat();
}
	public void printRecord(Employee emp) {
		
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee Department: "+this.department);
		System.out.println("Employee EmpId: "+this.empid);
		System.out.println("Employee Designation: "+this.designation);
		System.out.println("Employee Salary: "+this.salary);
		
	
 }
public class Program1 {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.acceptRecord(emp);
		emp.printRecord(emp);

	}
}
}


