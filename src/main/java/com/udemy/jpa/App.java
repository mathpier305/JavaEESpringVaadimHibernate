package com.udemy.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal.jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		/*
		 * INSERT INTO DATA THROUGH PERSISTENCE Person p1 = new Person("Kevin",
		 * "kevin@gmail.com"); Person p2 = new Person("JOe", "joe@gmail.com");
		 * 
		 * entityManager.persist(p1); entityManager.persist(p2);
		 */

		/*
		 * Find REcord Person p = entityManager.find(Person.class, 3);
		 * System.out.println(p);
		 * 
		 */

		/*
		 * Delete REcord Person p = entityManager.find(Person.class, 4);
		 * entityManager.remove(p);
		 */
		/*
		 * Person p1 = new Person("Joe", 18); Person p2 = new Person("Joel", 29); Person
		 * p3 = new Person("Johanna", 22); Person p4 = new Person("Joey", 12); Person p5
		 * = new Person("Jordan", 32);
		 * 
		 * entityManager.persist(p1); entityManager.persist(p2);
		 * entityManager.persist(p3); entityManager.persist(p4);
		 * entityManager.persist(p5);
		 */

		/*
		 * Query query = entityManager.
		 * createQuery("SELECT p from Person p WHERE p.name like '%joe%' ORDER BY p.age ASC"
		 * );
		 */
		/*
		 * Query query =
		 * entityManager.createNativeQuery("SELECT * FROM PERSON_TABLE where age > 20",
		 * Person.class);
		 * 
		 * List<Person> people = (List<Person>)query.getResultList();
		 * 
		 * for(Person p : people) { System.out.println(p); }
		 */

		/*TypedQuery<Person> query = entityManager.createNamedQuery("person.getPersonById", Person.class);
		query.setParameter("id", 5);*/
		
		TypedQuery<Person> query = entityManager.createNamedQuery("person.getPersonByName", Person.class);
		query.setParameter("name", "joe" );
		List<Person> people = query.getResultList();

		for (Person p : people) {
			System.out.println(p);
		}

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
	}
}
