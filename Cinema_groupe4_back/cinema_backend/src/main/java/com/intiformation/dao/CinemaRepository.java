package com.intiformation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.intiformation.modele.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {

	Optional<Cinema> findByNom(String nom);
	
	@Query("select c from Cinema c where c.Ville = :maVille")
	List<Cinema> findAllByVille(@Param ("maVille") String maVille);
}
