package com.victornogueira.productandconsumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victornogueira.productandconsumer.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
