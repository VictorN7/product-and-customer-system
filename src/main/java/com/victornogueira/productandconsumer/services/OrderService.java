package com.victornogueira.productandconsumer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victornogueira.productandconsumer.entities.Order;
import com.victornogueira.productandconsumer.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository; 

	public List<Order> findAll(){
		return orderRepository.findAll();
	}

	public Order findById(Long Id) {
		
		Optional<Order> order = orderRepository.findById(Id);
		return order.get();
	}
}