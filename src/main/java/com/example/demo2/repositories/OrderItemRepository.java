package com.example.demo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entities.OrderItem;
import com.example.demo2.entities.pk.OrderItemPK;



public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPK>{
	
	

}
