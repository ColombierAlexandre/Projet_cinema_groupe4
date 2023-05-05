package com.intiformation.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.intiformation.modele.Programmation;

public interface ProgrammationRepository extends JpaRepository<Programmation, Long>{
	
}
