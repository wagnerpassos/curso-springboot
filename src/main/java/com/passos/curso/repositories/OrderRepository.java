package com.passos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.passos.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
