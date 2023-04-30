package com.cdac.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

public class EmployeeDao {
	
	public void add(Employee1 emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(emp);
		tx.commit();
		emf.close();
		
	}
	
	public Employee1 fetch(int empid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Employee1 emp = em.find(Employee1.class, empid);
		emf.close();
		return emp;
		
	}
	//IMP 
	public List<Employee1> fetchAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		javax.persistence.Query q =  em.createQuery("select e from Employee1 e  ");
		List<Employee1> list =  q.getResultList();
		emf.close();
		return list;
	
	
	}
			
}
	


