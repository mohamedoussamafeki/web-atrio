package com.webatrio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webatrio.entity.Personne;


@Repository
public interface PersonneRepository  extends JpaRepository<Personne, Long >{

}
