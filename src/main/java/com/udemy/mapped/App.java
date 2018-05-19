package com.udemy.mapped;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal.jpa");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		StudentPerson studentPerson = new StudentPerson();
		studentPerson.setName(" Joe Smith");
		studentPerson.setAge(22);
		studentPerson.setDrivingLicense("Joe Driving License...");

		entityManager.persist(studentPerson);

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
