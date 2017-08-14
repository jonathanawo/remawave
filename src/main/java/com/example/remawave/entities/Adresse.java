package com.example.remawave.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adresse implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String rue;
	private String ville;
	private String codepostal;
	private String pays;
	
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
}
