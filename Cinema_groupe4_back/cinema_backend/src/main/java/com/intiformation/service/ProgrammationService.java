package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.ProgrammationRepository;
import com.intiformation.modele.Programmation;

@Service
public class ProgrammationService {

	private ProgrammationRepository programmationRepository;

	@Autowired
	public void setProgrammationRepository(ProgrammationRepository programmationRepository) {
		this.programmationRepository = programmationRepository;
	}

	public Programmation addProgrammation(Programmation programmation) {
		return programmationRepository.save(programmation);
	}

	public Programmation updateProgrammation(Programmation programmation) {
		return programmationRepository.save(programmation);
	}

	public void deleteProgrammation(Long idProgrammation) {
		programmationRepository.deleteById(idProgrammation);
	}

	public Programmation getProgrammationById(Long idProgrammation) {
		Optional<Programmation> optProgrammation = programmationRepository.findById(idProgrammation);
		if (optProgrammation.isPresent()) {
			return optProgrammation.get();
		}
		return null;
	}

	public List<Programmation> getAllProgrammation() {
		return programmationRepository.findAll();
	}

}
