package com.udemy.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal.jpa");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Bus bus = new Bus("name of bus", 200);
		Car car = new Car("name of Car", 250);
		
		entityManager.persist(car);
		entityManager.persist(bus);

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
