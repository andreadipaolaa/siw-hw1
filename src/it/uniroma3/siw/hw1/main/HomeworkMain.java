package it.uniroma3.siw.hw1.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import it.uniroma3.siw.hw1.model.Corso;
import it.uniroma3.siw.hw1.model.Docente;
import it.uniroma3.siw.hw1.model.Societa;


public class HomeworkMain {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hw1-unit");
		EntityManager em = emf.createEntityManager();
		
		Societa societa= new Societa("azienda",null,  "+39 3881112233");
		
		Docente docente = new Docente();
				
		Corso corso1= new Corso();
		Corso corso2= new Corso();
		corso1.setNome("corso1");
		corso1.setNome("corso2");
		docente.getCorsiTenuti().add(corso1);
		docente.getCorsiTenuti().add(corso2);

		
		EntityTransaction tx= em.getTransaction();
		
		tx.begin();
		em.persist(docente);
		em.persist(societa);
		
		tx.commit();
		em.close();
		em=emf.createEntityManager();
		
		TypedQuery<Docente> queryDocenti= em.createQuery("SELECT d FROM Docente d", Docente.class);
		
		List<Docente> docenti= queryDocenti.getResultList();
		
		System.out.println("-----------");
		for (Docente prof : docenti) {
			for (Corso corso : prof.getCorsiTenuti()) {
				System.out.println(corso.getNome());
				
			}
		}
		
		em.close();
		emf.close();

	} 
}
