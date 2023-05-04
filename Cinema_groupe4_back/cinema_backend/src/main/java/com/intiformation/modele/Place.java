package com.intiformation.modele;

import jakarta.persistence.Entity;

@Entity
public class Place {
	
	private long numeroPlace;
	private boolean isUsed;
	
	public Place() {
	}

	public Place(boolean isUsed) {
		this.isUsed = isUsed;
	}

	public Place(long numeroPlace, boolean isUsed) {
		this.numeroPlace = numeroPlace;
		this.isUsed = isUsed;
	}

	public long getNumeroPlace() {
		return numeroPlace;
	}

	public void setNumeroPlace(long numeroPlace) {
		this.numeroPlace = numeroPlace;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}
	
}
