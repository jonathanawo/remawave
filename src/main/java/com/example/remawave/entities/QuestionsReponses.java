package com.example.remawave.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class QuestionsReponses implements Serializable{
	@Id @GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name="id_question")
	private Questions question;
	@ManyToOne
	@JoinColumn(name="id_reponse")
	private Reponses reponse;
	private Integer ordre;
    @ManyToOne
    @JoinColumn(name="id_question_suivante")
	private Questions questionsuivante;

}
