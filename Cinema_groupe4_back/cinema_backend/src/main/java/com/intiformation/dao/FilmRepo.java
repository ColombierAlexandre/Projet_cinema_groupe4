package com.intiformation.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiformation.modele.Film;

public interface FilmRepo extends JpaRepository<Film, Integer> {
	
	Optional<Film> findByTitre(String titre);
	
	

}
