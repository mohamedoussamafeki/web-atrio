package com.webatrio.service;

import java.util.List;

import com.webatrio.entity.Personne;


public interface IPersonneService {
	public List<Personne> showPersonnes();
	public void addPersonne(Personne p);
}
