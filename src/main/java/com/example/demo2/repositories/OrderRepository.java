package com.example.demo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entities.Order;


public interface OrderRepository  extends JpaRepository<Order, Long>{
	
	

}
