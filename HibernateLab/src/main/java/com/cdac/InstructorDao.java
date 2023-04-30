package com.cdac;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.mysql.cj.Query;

public class InstructorDao {
	
	

	public void add(InstructorEntity instentity) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(instentity);
		tx.commit();
		emf.close();
	}
	
	public void add(InstructorDetails instdetails) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		em.persist(instdetails);
		tx.commit();
		emf.close();
		
	}
	
	
	public List<InstructorEntity>fetchInstructorEntityCourses( String Courses) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		javax.persistence.Query q = em.createQuery("select ie from InstructorEntity ie join ie.instdetails idetais where idetais.Courses  =:cr");
		q.setParameter("cr",Courses);
		List<InstructorEntity> list = q.getResultList();
		return list;
	}
	
	public List<InstructorEntity>fetchInstructorEntityEmail( String domain) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		javax.persistence.Query q = em.createQuery("select ie from InstructorEntity ie where ie.email like:em");
		
		q.setParameter("em","%"+domain+"%");
		
		List<InstructorEntity> list = q.getResultList();
		emf.close();
		return list;
	}
	
	

}
