package com.example.remawave;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.remawave.dao.GroupeRepository;
import com.example.remawave.dao.QuestionsRepository;
import com.example.remawave.dao.ReponsesRepository;
import com.example.remawave.dao.UserRepository;
import com.example.remawave.entities.Groupe;
import com.example.remawave.entities.Questions;
import com.example.remawave.entities.Reponses;

@SpringBootApplication
public class RemawaveApplication implements CommandLineRunner{
	@Autowired
	private GroupeRepository groupeRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private QuestionsRepository questionsRepository;
	@Autowired
	private ReponsesRepository reponsesRepository;

	public static void main(String[] args) {
		SpringApplication.run(RemawaveApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		groupeRepository.save(new Groupe("Administrateur"));
		groupeRepository.save(new Groupe("Client"));
		
		questionsRepository.save(new Questions("Quels Types de Cheveux avez vous?"));
		reponsesRepository.save(new Reponses("Cheveux Crépus"));
		reponsesRepository.save(new Reponses("Cheveux Lisses"));
		
		
		
		
		List<Groupe> groupes = groupeRepository.findAll();
		groupes.forEach(p -> System.out.println(p.getName()));
		
	}
}
