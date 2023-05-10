package com.intiformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiformation.modele.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
