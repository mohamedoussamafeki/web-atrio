package com.webatrio.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.type.LocalDateType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webatrio.dto.PersonneDTO;
import com.webatrio.entity.Personne;
import com.webatrio.service.impl.PersonneServiceImpl;


@RestController
public class PersonneController {

	 @Autowired
	 PersonneServiceImpl personneService;
	 
	 @GetMapping("/personnes")
	 public List<PersonneDTO> showAllPersonne() {
			List<Personne> personnes = personneService.showPersonnes().stream()
					.sorted(Comparator.comparing(Personne::getNom))
					.collect(Collectors.toList());
			List<PersonneDTO> personnesDto = new ArrayList<>();
			LocalDate today = LocalDate.now();
			 for (Personne personne : personnes) {
				personnesDto.add(new PersonneDTO(personne.getNom(), personne.getPrenom(),today.getYear()-personne.getDateDeNaissance().getYear()) );
			}
			 return personnesDto;
		}

	 @PostMapping("/addPersonne")
	 @ResponseBody
	 public void addPersonne(@RequestBody Personne personne) {
		 personneService.addPersonne(personne);
		}
}
