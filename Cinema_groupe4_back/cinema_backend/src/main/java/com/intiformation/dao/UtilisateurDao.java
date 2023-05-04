package com.intiformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiformation.modele.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
	
	
	
}
