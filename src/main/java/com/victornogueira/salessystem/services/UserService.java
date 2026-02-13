package com.victornogueira.salessystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victornogueira.salessystem.entities.User;
import com.victornogueira.salessystem.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository; 

	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User findById(Long Id) {
		
		Optional<User> user = userRepository.findById(Id);
		return user.get();
	}
	
	public User insertUser(User user) {
		return userRepository.save(user);
	}
}