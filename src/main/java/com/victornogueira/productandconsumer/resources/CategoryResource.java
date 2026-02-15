package com.victornogueira.productandconsumer.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victornogueira.productandconsumer.entities.Category;
import com.victornogueira.productandconsumer.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

	private CategoryService categoryService;
	
	public CategoryResource(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		return ResponseEntity.ok().body(categoryService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> getMethodName(@PathVariable Long id) {
		return ResponseEntity.ok().body(categoryService.findById(id));
		
	}
}