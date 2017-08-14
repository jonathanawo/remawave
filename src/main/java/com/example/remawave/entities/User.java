package com.example.remawave.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Email;

@Entity
public class User implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	@Email
	@Column(unique=true)
	private String email;
	private String password;
	private String contact;
	@ManyToOne
	@JoinColumn(name="id_groupe")
	private Groupe groupid;
	@OneToOne
	@JoinColumn(name="adresse_id")
	private Adresse adressid;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Groupe getGroupid() {
		return groupid;
	}
	public void setGroupid(Groupe groupid) {
		this.groupid = groupid;
	}
	public Adresse getAdressid() {
		return adressid;
	}
	public void setAdressid(Adresse adressid) {
		this.adressid = adressid;
	}
	
	
	
	
}
