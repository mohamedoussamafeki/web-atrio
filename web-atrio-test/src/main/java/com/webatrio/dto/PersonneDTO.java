package com.webatrio.dto;

public class PersonneDTO {
	private String nom ;
	private String prenom ;
	private int age;
	
	public PersonneDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonneDTO( String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
