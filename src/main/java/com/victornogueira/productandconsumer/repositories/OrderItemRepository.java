package com.victornogueira.productandconsumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victornogueira.productandconsumer.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
