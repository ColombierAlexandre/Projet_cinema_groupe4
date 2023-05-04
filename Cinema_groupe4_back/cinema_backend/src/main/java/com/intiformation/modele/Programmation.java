package com.intiformation.modele;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Programmation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_programmation")
	private long idProgrammation;
	private Date dateHeureProg;
	private List<Place> listePlaces;
	@ManyToOne
	@JoinColumn(name = "film_id", referencedColumnName = "visaExploitation")
	private Film film;
	@ManyToOne
	@JoinColumn(name = "salle_id", referencedColumnName = "idSalle")
	private Salle salle;
	
	public Programmation(Date dateHeureProg, Film film, Salle salle) {
		this.dateHeureProg = dateHeureProg;
		this.listePlaces = genererListePlaces(salle);
	}
	
	public Programmation(long idProgrammation, Date dateHeureProg, Film film, Salle salle) {
		this.idProgrammation = idProgrammation;
		this.dateHeureProg = dateHeureProg;
		this.film = film;
		this.salle = salle;
		this.listePlaces = genererListePlaces(salle);
	}
	
	private List<Place> genererListePlaces(Salle salle) {
		for(int i=0;i<salle.getNombreDePlaces();i++) {
			Place place = new Place(i+1,false);
			this.listePlaces.add(place);
		}
		return listePlaces;
	}

	public long getIdProgrammation() {
		return idProgrammation;
	}

	public void setIdProgrammation(long idProgrammation) {
		this.idProgrammation = idProgrammation;
	}

	public Date getDateHeureProg() {
		return dateHeureProg;
	}

	public void setDateHeureProg(Date dateHeureProg) {
		this.dateHeureProg = dateHeureProg;
	}

	public List<Place> getListePlaces() {
		return listePlaces;
	}

	public void setListePlaces(List<Place> listePlaces) {
		this.listePlaces = listePlaces;
	}
}
