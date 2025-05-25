package com.example.demo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entities.Product;


public interface ProductRepository  extends JpaRepository<Product, Long>{
	
	

}
