package com.intiformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.modele.Reservation;
import com.intiformation.service.ReservationService;

@RestController
@RequestMapping("reservation_api")
@CrossOrigin("http://localhost:4200")
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
	
	@PostMapping
	public Reservation addReservationController(@RequestBody Reservation reservation) {
		return reservationService.addReservationService(reservation);
	}

	@PutMapping
	public Reservation updateReservationController(@RequestBody Reservation reservation) {
		return reservationService.updateReservationService(reservation);
	}

	@GetMapping("getById/{id}")
	public Reservation getReservationByIdController(@PathVariable("id") Long idReservation) {
		return reservationService.getReservationByIdService(idReservation);
	}

	@GetMapping
	public List<Reservation> getAllReservationsController() {
		return reservationService.getAllReservationsService();
	}

	@DeleteMapping("/{id}")
	public void deleteReservationController(@PathVariable("id") Long idReservation) {
		reservationService.deleteReservationService(idReservation);
	}
	
	
}
