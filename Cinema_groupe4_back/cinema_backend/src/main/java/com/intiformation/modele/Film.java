package com.intiformation.modele;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Film {
	
	@Id
	private int visaExploitation;
	private String titre ; 
	private Time duree;
	private String realisateur; 
	private String producteur; 
	private String[] acteurs;
	private Date dateDeSortie;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Caracteristiques_join_Film", joinColumns = @JoinColumn(name = "IdFilm"), inverseJoinColumns=@JoinColumn(name="IdCarac"))
	private List<Caracteristiques> listeCaracteristiques;
	
	public Film() {
		super();
	}

	public Film(int visaExploitation, String titre, Time duree, String realisateur, String producteur, String[] acteurs,
			Date dateDeSortie, List<Caracteristiques> listeCaracteristiques) {
		super();
		this.visaExploitation = visaExploitation;
		this.titre = titre;
		this.duree = duree;
		this.realisateur = realisateur;
		this.producteur = producteur;
		this.acteurs = acteurs;
		this.dateDeSortie = dateDeSortie;
		this.listeCaracteristiques = listeCaracteristiques;
	}

	public int getVisaExploitation() {
		return visaExploitation;
	}

	public void setVisaExploitation(int visaExploitation) {
		this.visaExploitation = visaExploitation;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Time getDuree() {
		return duree;
	}

	public void setDuree(Time duree) {
		this.duree = duree;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public String getProducteur() {
		return producteur;
	}

	public void setProducteur(String producteur) {
		this.producteur = producteur;
	}

	public String[] getActeurs() {
		return acteurs;
	}

	public void setActeurs(String[] acteurs) {
		this.acteurs = acteurs;
	}

	public Date getDateDeSortie() {
		return dateDeSortie;
	}

	public void setDateDeSortie(Date dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}

	public List<Caracteristiques> getListeCaracteristiques() {
		return listeCaracteristiques;
	}

	public void setListeCaracteristiques(List<Caracteristiques> listeCaracteristiques) {
		this.listeCaracteristiques = listeCaracteristiques;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
