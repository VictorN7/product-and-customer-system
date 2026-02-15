package com.victornogueira.productandconsumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victornogueira.productandconsumer.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
