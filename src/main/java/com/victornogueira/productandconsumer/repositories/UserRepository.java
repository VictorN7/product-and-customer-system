package com.victornogueira.productandconsumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victornogueira.productandconsumer.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
