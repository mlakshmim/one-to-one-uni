package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindPersonById {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		Person p = em.find(Person.class, 2);

		System.out.println("------person info-------");
		System.out.println("Person id:" + p.getId());
		System.out.println("Person name:" + p.getName());
		System.out.println("Person gender:" + p.getGender());

		Pan pan = p.getPan();
		if (pan != null) {
			System.out.println("-------Pan info------");
			System.out.println("Pan id:" + pan.getId());
			System.out.println("Pan number:" + pan.getNumber());
			System.out.println("Pan type:" + pan.getType());
		}
	}

}
