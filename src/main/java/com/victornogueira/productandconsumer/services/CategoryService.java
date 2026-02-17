package com.victornogueira.productandconsumer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victornogueira.productandconsumer.entities.Category;
import com.victornogueira.productandconsumer.repositories.CategoryRepository;
import com.victornogueira.productandconsumer.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository; 

	public List<Category> findAll(){
		return categoryRepository.findAll();
	}

	public Category findById(Long Id) {
		return categoryRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException(Id));
	}
	
}
