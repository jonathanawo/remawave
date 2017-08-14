package com.example.remawave.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.remawave.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
