package com.intiformation.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cinema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCinema;
	private String nom;
	private long telephone;
	private String mail;
	private String rue;
	private String ville;
	private int codePostal;

	public Cinema() {
	}

	public Cinema(String nom, long telephone, String mail, String rue, String ville, int codePostal) {
		this.nom = nom;
		this.telephone = telephone;
		this.mail = mail;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	public Cinema(long idCinema, String nom, long telephone, String mail, String rue, String ville, int codePostal) {
		this.idCinema = idCinema;
		this.nom = nom;
		this.telephone = telephone;
		this.mail = mail;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	public long getIdCinema() {
		return idCinema;
	}

	public void setIdCinema(long idCinema) {
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

	public String getRue() {
		return rue;
	}

	public String getVille() {
		return ville;
	}

	public int getCodePostal() {
		return codePostal;
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

}