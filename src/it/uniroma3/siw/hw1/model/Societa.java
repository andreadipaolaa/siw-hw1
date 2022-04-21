package it.uniroma3.siw.hw1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Societa {
	
	
	
	public Societa(String ragioneSociale, Indirizzo indirizzo, String numTelefono) {
		this.ragioneSociale = ragioneSociale;
		this.indirizzo = indirizzo;
		this.numTelefono = numTelefono;
	}
	
	public Societa() {
		return;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String ragioneSociale;
	
	@OneToOne
	private Indirizzo indirizzo;
	
	private String numTelefono;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setSede(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}
}
