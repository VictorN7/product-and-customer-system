package com.victornogueira.productandconsumer.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.victornogueira.productandconsumer.entities.Product;
import com.victornogueira.productandconsumer.repositories.ProductRepository;

@Service
public class ProductService {

	private ProductRepository productRepository; 
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		
		return productRepository.findById(id)
		        .orElseThrow();
	}
}
