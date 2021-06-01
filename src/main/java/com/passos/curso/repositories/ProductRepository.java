package com.passos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passos.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
