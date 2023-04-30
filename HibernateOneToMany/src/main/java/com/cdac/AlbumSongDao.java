package com.cdac;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AlbumSongDao {

   public void add(Album album) {
	
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	   EntityManager em = emf.createEntityManager();
	   EntityTransaction tx = em.getTransaction();
	   
	   tx.begin();
	   em.persist(album);
	   tx.commit();
	   em.close();
	
    }
   public void add(Song songs) {
		
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
	   EntityManager em = emf.createEntityManager();
	   EntityTransaction tx = em.getTransaction();
	   
	   tx.begin();
	   em.persist(songs);
	   tx.commit();
	   em.close();
	
    }

}
