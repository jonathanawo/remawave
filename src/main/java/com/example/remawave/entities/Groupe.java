package com.example.remawave.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Groupe implements Serializable{
	@Id @GeneratedValue
	public long id;
	@Column(unique=true)
	public String name;
	
	
	
	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Groupe(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
