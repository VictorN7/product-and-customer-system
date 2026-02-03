package com.victornogueira.salessystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victornogueira.salessystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
