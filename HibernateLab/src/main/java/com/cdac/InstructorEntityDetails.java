package com.cdac;

import java.util.List;

public class InstructorEntityDetails {

	public static void main(String[] args) {
		
		InstructorDao dao = new InstructorDao();
		
		InstructorEntity ie = new InstructorEntity();
		
		/*ie.setFirstName("Nilesh");
		ie.setEmail("nileshsatse2324@gmail.com");
		ie.setLastName("Saste");
		
		InstructorDetails id = new InstructorDetails();
		
		id.setCourses("Advajava");
		id.setSub_Taken("Spring-MVC");
		
		
		ie.setInstdetails(id);
		id.setInstentity(ie);
		dao.add(ie);*/
		
		/*List<InstructorEntity> list=dao.fetchInstructorEntityCourses("MVC");
		for(InstructorEntity ie1 : list) {
			System.out.println(ie1.getFirstName() +" "+ie1.getLastName());*/
		
		List<InstructorEntity> list = dao.fetchInstructorEntityEmail("nileshsatse2324@gmail.com");
				for(InstructorEntity ie2 : list) {
					System.out.println(ie2.getFirstName()+" "+ie2.getLastName());
			
			
		}
		
		
		
		
		
		//List<InstructorEntity> list = dao.fetchInstructorEntityCourses("AdvJava");
		//for(InstructorEntity ie:list) {
		//	System.out.println(ie.getFirstName()+" "+ie.getLastName()+" "+ie.getEmail());
		//}
		
		
		
		
		
		

	}

}
