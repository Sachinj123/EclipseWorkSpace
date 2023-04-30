package com.cdac.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.cdac.entity.User;
import javax.persistence.PersistenceContexts;
import javax.transaction.Transactional;


@Component
public class UserDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional 
	public void add(User user) {
		entityManager.persist(user);
	}

}
