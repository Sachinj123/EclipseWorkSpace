package com.cdac.entity;

import java.time.LocalDate;
import java.util.List;

public class InsertEmployee {

	public static void main(String[] args) {
		/*Employee1 emp = new Employee1();
		//emp.setEmpid(1); he auto increment ahee tyamule pahile error yet hota
		emp.setName("SACHIN");
		emp.setSalary(35000);
		emp.setDateOfJoining(LocalDate.of(2023, 04, 29));
		
		EmployeeDao dao = new EmployeeDao();
		dao.add(emp);*/
		
		/*EmployeeDao dao = new EmployeeDao();
		Employee1 emp = dao.fetch(1);
		System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDateOfJoining());*/
		
		EmployeeDao dao = new EmployeeDao();
		List<Employee1> list =  dao.fetchAll();
		for(Employee1 emp:list )
			System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDateOfJoining()+" "+emp.getEmpid());
		
		
	}

}
