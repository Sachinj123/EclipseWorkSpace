package com.cdac.Hibernateapp2;

import java.time.LocalDate;
import java.util.List;

public class PersonPassportExample {

	public static void main(String[] args) {
		
		PersonPassportDao dao = new PersonPassportDao();
		
		/*Person p = new Person();
		
		p.setName("Sampada Jadhav");
		p.setEmail("sampadajadhav2903@gmail.com");
		p.setDateOfBirth(LocalDate.of(2000, 8, 25));
		
		Passport ps = new Passport();
		
		ps.setIssueDate(LocalDate.of(2020, 8, 15));
		ps.setExpiryDate(LocalDate.of(2030, 6, 15));
		ps.setIssueBy("Govt. Of India");
		
		p.setPassport(ps);
		ps.setPerson(p);
		dao.add(p);*/
		
		List<Person> list = dao.fetchPersonByPassportExpiryYear(2030);
				for(Person p:list)
					System.out.println(p.getName()+" "+p.getEmail()+" "+p.getDateOfBirth());
		

	}

}
