package com.intiformation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.intiformation.modele.Salle;

public interface SalleRepository extends JpaRepository<Salle, Long> {
	
	Optional<Salle> findByNumero (int Numero);
	
	@Query("select s from Salle s where s.cinemaId = :monIdCinema")
	List<Salle> findAllByIdCinema(@Param ("monIdCinema") long monIdCinema);

}

