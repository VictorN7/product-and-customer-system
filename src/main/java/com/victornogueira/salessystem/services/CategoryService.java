package com.victornogueira.salessystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victornogueira.salessystem.entities.Category;
import com.victornogueira.salessystem.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository; 

	public List<Category> findAll(){
		return categoryRepository.findAll();
	}

	public Category findById(Long Id) {
		
		Optional<Category> order = categoryRepository.findById(Id);
		return order.get();
	}
	
}
