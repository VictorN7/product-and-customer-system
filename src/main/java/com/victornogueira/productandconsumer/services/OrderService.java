package com.victornogueira.productandconsumer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victornogueira.productandconsumer.entities.Order;
import com.victornogueira.productandconsumer.repositories.OrderRepository;
import com.victornogueira.productandconsumer.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository; 

	public List<Order> findAll(){
		return orderRepository.findAll();
	}

	public Order findById(Long Id) {
		return orderRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException(Id));
	}
}