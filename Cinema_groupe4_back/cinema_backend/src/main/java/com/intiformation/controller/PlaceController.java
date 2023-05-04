package com.intiformation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.modele.Place;
import com.intiformation.service.PlaceService;

@RestController
@RequestMapping("/place")
public class PlaceController {
	
	private PlaceService placeService;

	public void setPlaceService(PlaceService placeService) {
		this.placeService = placeService;
	}
	
	@PostMapping
	public Place ajouterPlace(@RequestBody Place place) {
		return placeService.addPlace(place);
	}
	
	@PutMapping
	public Place updatePlace(@RequestBody Place place) {
		return placeService.updatePlace(place);
	}
	
	@DeleteMapping("/{id}")
	public void deletePlace(@PathVariable("id") Long idPlace) {
		placeService.deletePlace(idPlace);
	}
	
	@GetMapping("/{id}")
	public Place getPlaceById(@PathVariable("id") Long idPlace) {
		return placeService.getPlaceById(idPlace);
	}
	
	@GetMapping
	public List<Place> getAllProgrammation(){
		return placeService.getAllPlace();
	}

}
