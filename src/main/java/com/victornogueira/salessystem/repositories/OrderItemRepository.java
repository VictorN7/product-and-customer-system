package com.victornogueira.salessystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victornogueira.salessystem.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
