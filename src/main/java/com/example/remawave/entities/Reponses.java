package com.example.remawave.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reponses implements Serializable{
	@Id @GeneratedValue
	private long id;
	private String intitule;
	
	public Reponses(String intitule) {
		super();
		this.intitule = intitule;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	

}
