package com.intiformation.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiformation.modele.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
	
	public Optional<Utilisateur> findByEmail(String email);
	
}
