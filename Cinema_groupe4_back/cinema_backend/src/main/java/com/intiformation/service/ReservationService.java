package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.ReservationRepository;
import com.intiformation.modele.Reservation;

@Service
public class ReservationService {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	public Reservation addReservationService(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	public Reservation updateReservationService(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	public Reservation getReservationByIdService(Long idReservation) {
		Optional<Reservation> optionalReservation = reservationRepository.findById(idReservation);
		if (optionalReservation.isPresent()) {
			return optionalReservation.get();
		} else {
			System.out.println("Réservation non trouvé :(");
			return null;
		}
	}

	public List<Reservation> getAllReservationsService() {
		return reservationRepository.findAll();
	}

	public void deleteReservationService(Long idReservation) {
		reservationRepository.deleteById(idReservation);
	}
	
	
}
