package com.example.demo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entities.Category;


public interface CategoryRepository  extends JpaRepository<Category, Long>{
	
	

}
