package com.webatrio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webatrio.entity.Personne;
import com.webatrio.repository.PersonneRepository;
import com.webatrio.service.IPersonneService;

@Service
public class PersonneServiceImpl implements IPersonneService {
	 @Autowired
	 PersonneRepository personneRepository;

	@Override
	public List<Personne> showPersonnes() {
		return personneRepository.findAll();
	}

	@Override
	public void addPersonne(Personne p) {
		personneRepository.save(p);
	}
}
