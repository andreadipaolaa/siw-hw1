package it.uniroma3.siw.hw1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HomeworkMain {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hw1-unit");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();

	} 
}
