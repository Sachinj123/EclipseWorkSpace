package com.cdac.spring;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("carPart3")
public class CarPartsInventoryImpl3 implements CarPartInventory {

	//@Autowired ---> doesnt work if we need to inject EntityManager
	//Apan Spring la sangtoy ki object create karun de 
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void addNewPart(CarPart carPart)  {
		em.persist(carPart);
	}

	public List<CarPart> getAvailableParts() {
		
		return em
				.createQuery("select c from CarPart c",CarPart.class)
				.getResultList();
	}

	
	

}
