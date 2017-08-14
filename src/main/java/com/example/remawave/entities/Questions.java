package com.example.remawave.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Questions implements Serializable{
	@Id @GeneratedValue
	private long id;
	@Column(unique=true)
	private String intitule;
	
	
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Questions(String intitule) {
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
