package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDriver {

	public static void main(String[] args) {
      EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
      EntityManager em=emf.createEntityManager();
      
      Person person=new Person();
      person.setName("Vinay");
      person.setGender("male");
      
      Pan pan=new Pan();
      pan.setNumber("VM123TY55");
      pan.setType("BUSINESS");
      person.setPan(pan);
       
      EntityTransaction et=em.getTransaction();
      et.begin();
      em.persist(person);
      em.persist(pan);
      et.commit();
      
	}

}
