package com.intiformation.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;ategy = GenerationType.IDENTITY)
	private int idCinema;

	@Column(name = "Nom")
	private String nom;

	@Column(name = "Telephone")
	private long telephone;

	@Column(name = "Mail")
	private String mail;

	@Column(name = "Rue")
	private String rue;

	@Column(name = "Ville")
	private String ville;

	@Column(name = "Code Postal")
	private int codePostal;

	/******************** Constructeurs ****************************/

	public Cinema() {
		super();
	}

	public Cinema(String nom, long telephone, String mail, String rue, String ville, int codePostal) {
		super();
		this.nom = nom;
		this.telephone = telephone;
		this.mail = mail;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	public Cinema(int idCinema, String nom, long telephone, String mail, String rue, String ville, int codePostal) {
		super();
		this.idCinema = idCinema;
		this.nom = nom;
		this.telephone = telephone;
		this.mail = mail;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	
	/******************** Getters and Setters ******************************/
	
	public int getIdCinema() {
		return idCinema;
	}

	public void setIdCinema(int idCinema) {
		this.idCinema = idCinema;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getTelephone() {
		return telephone;
	}

	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	/********************* To String *************************/
	
	@Override
	public String toString() {
		return "Cinema [idCinema=" + idCinema + ", nom=" + nom + ", telephone=" + telephone + ", mail=" + mail
				+ ", rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + "]";
	}

}
