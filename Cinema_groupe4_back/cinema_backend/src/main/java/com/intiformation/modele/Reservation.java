package com.intiformation.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Reservation {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reservation")
	private long id;
	private String nom;
	private String prenom;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "programmation_id", referencedColumnName = "id_programmation")
	private Programmation programmation;
	

	public Reservation() {
		super();
	}

	public Reservation(String nom, String prenom, Programmation programmation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.programmation = programmation;
	}

	public Reservation(long id, String nom, String prenom, Programmation programmation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.programmation = programmation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Programmation getProgrammation() {
		return programmation;
	}

	public void setProgrammation(Programmation programmation) {
		this.programmation = programmation;
	}

	
	
	
}
