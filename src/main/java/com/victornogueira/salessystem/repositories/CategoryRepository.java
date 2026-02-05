package com.victornogueira.salessystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victornogueira.salessystem.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
