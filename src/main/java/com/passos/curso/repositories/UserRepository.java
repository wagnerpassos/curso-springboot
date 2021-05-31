package com.passos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passos.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
