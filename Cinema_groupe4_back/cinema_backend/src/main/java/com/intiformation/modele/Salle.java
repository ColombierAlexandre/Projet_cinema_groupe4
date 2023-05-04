package com.intiformation.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Salle {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSalle;
	
	 @Column(name = "Numero de Salle")
	private int numero;
	
	 @Column(name = "Nombre de Places")
	private int nombreDePlaces;
	
	@ManyToOne
	@JoinColumn(name="CinemaId", referencedColumnName = "id")
	private int cinemaId;
	
	/******************** Constructeurs ****************************/
	
	public Salle() {
		super();
	}

	public Salle(int numero, int nombreDePlaces, int cinemaId) {
		super();
		this.numero = numero;
		this.nombreDePlaces = nombreDePlaces;
		this.cinemaId = cinemaId;
	}

	public Salle(int idSalle, int numero, int nombreDePlaces, int cinemaId) {
		super();
		this.idSalle = idSalle;
		this.numero = numero;
		this.nombreDePlaces = nombreDePlaces;
		this.cinemaId = cinemaId;
	}
	
	/******************** Getters and Setters ******************************/

	public int getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNombreDePlaces() {
		return nombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}

	public int getCinemaId() {
		return cinemaId;
	}

	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}

	/********************* To String *************************/
	
	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", numero=" + numero + ", nombreDePlaces=" + nombreDePlaces + ", cinemaId="
				+ cinemaId + "]";
	}
	
}