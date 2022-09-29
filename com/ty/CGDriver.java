package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CGDriver {

	public static void main(String[] args) {
      EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
      EntityManager entityManager= entityManagerFactory.createEntityManager();
      
     GST gst=new GST();
     gst.setNumber("SDff5244RFR");
     gst.setStatus("Active");
     Company company=new Company();
     company.setName("XYZ");
     company.setAddress("Bangalore");
     gst.setCompany(company);
     
     EntityTransaction et=entityManager.getTransaction();
     et.begin();
     entityManager.persist(company);
     entityManager.persist(gst);
     et.commit();
     
	}

}
