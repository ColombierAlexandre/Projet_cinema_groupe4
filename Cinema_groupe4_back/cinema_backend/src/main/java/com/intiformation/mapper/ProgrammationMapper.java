package com.intiformation.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.intiformation.businessObject.ProgrammationBo;
import com.intiformation.controller.PlaceController;
import com.intiformation.modele.Place;
import com.intiformation.modele.Programmation;

public class ProgrammationMapper {

	private PlaceController placeController;

	@Autowired
	public void setPlaceController(PlaceController placeController) {
		this.placeController = placeController;
	}

	public ProgrammationBo creerProgrammationBo(Programmation programmation) {
		ProgrammationBo programmationBo = new ProgrammationBo();
		programmationBo.setIdProgrammation(programmation.getIdProgrammation());
		programmationBo.setDateHeureProg(programmation.getDateHeureProg());
		programmationBo.setFilm(programmation.getFilm());
		programmationBo.setSalle(programmation.getSalle());
		for (int i = 1; i <= programmation.getSalle().getNombreDePlaces(); i++) {
			Place place = new Place(i, false, programmation);
			placeController.ajouterPlace(place);
			programmationBo.getListePlaces().add(place);
		}
		return programmationBo;
	}

	public ProgrammationBo programmationToProgrammationBo(Programmation programmation) {
		ProgrammationBo programmationBo = new ProgrammationBo();
		programmationBo.setIdProgrammation(programmation.getIdProgrammation());
		programmationBo.setDateHeureProg(programmation.getDateHeureProg());
		programmationBo.setFilm(programmation.getFilm());
		programmationBo.setSalle(programmation.getSalle());
		programmationBo.setListePlaces(placeController.getAllPlaceForShow(programmation.getIdProgrammation()));
		return programmationBo;
	}

	public Programmation programmationBoToProgrammation(ProgrammationBo programmationBo) {
		Programmation programmation = new Programmation();
		programmation.setIdProgrammation(programmationBo.getIdProgrammation());
		programmation.setDateHeureProg(programmationBo.getDateHeureProg());
		programmation.setFilm(programmationBo.getFilm());
		programmation.setSalle(programmationBo.getSalle());
		return programmation;
	}

}
