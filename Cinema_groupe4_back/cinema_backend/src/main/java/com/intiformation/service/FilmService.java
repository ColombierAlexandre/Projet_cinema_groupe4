package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.FilmRepo;
import com.intiformation.modele.Film;

@Service
public class FilmService {
	
	
	@Autowired
	FilmRepo filmRepository;
	
	public Film addFilm (Film film) {
		return filmRepository.save(film);		
	}
	
	public Film updateFilm (Film film) {
		return filmRepository.save(film);
	}
	
	public void deleteFilm (int id) {
		filmRepository.deleteById(id);
	}

	public Film getFilmById(int id) {
		Optional<Film> optfilm=filmRepository.findById(id);
		Film film = null;
		if (optfilm.isPresent()) {
			film = optfilm.get();
		}
		
		  return film;
	}
	
	
	public List<Film> getALlFilm(){
		return filmRepository.findAll();
	}
	
	public Film getFilmByTitre(String titre) {
		Optional<Film> optfilm=filmRepository.findByTitre(titre);
		Film film = null;
		if (optfilm.isPresent()) {
			film = optfilm.get();
		}
		
		  return film;
	}
	
}
