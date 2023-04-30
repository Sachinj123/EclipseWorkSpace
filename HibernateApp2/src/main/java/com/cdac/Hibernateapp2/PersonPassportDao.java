package com.cdac.Hibernateapp2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

public class PersonPassportDao {
	
	public void add(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(person);
		tx.commit();
		emf.close();
	}
	
	public void add(Passport passport) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(passport);
		tx.commit();
		emf.close();
	}
	
	public Person fetchPersonByPassportNo(int passportNo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		javax.persistence.Query q = em.createQuery("select p from Person p join p.passport ps where ps.passportNo=:pno");
		q.setParameter("pno",passportNo);
		Person p = (Person) q.getSingleResult();
		return p;
	}
	
	
	public List<Person >fetchPersonByPassportExpiryYear(int year) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		javax.persistence.Query q = em.createQuery("select p from Person p join p.passport ps where year(ps.expiryDate)=:yr");
		q.setParameter("yr",year);
		List<Person> list = q.getResultList();
		return list;
	}

}
