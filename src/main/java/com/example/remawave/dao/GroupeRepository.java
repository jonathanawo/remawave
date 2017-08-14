package com.example.remawave.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.remawave.entities.Groupe;
@RestResource
public interface GroupeRepository extends JpaRepository<Groupe, Long>{

}
