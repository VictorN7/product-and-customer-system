package com.victornogueira.salessystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victornogueira.salessystem.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
