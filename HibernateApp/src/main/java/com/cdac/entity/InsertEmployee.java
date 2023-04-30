package com.cdac.entity;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertEmployee {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Employee emp = new Employee();
		emp.setEmpno(105);
		emp.setName("Siddsesh Naik");
		emp.setSalary(60000);
		emp.setDateOfJoining(LocalDate.of(2023, 7, 03));
		em.persist(emp);//Persist method will generate insert query
		
		tx.commit();
		emf.close();
		
	}

}
