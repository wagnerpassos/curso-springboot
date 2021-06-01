package com.passos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passos.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
