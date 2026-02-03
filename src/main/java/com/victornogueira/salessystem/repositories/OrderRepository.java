package com.victornogueira.salessystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victornogueira.salessystem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
