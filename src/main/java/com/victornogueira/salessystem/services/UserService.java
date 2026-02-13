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
	
	public void delete(Long id){
		/*
		 * User user = userRepository.findById(id).orElseThrow();
		 * userRepository.delete(user);
		 */
		
		userRepository.deleteById(id);
	}
	
	public User update(Long id, User user) {
		
		// Reference apenas prepara e deixa o objeto monitorado pra depois efetuar ações no banco de dados
		// diferente do findById que vai até o banco e traz o objeto
		
		User entity = userRepository.getReferenceById(id); 
		
		updateData(entity, user);
		
		return userRepository.save(entity);
		
	}
	
	private void updateData(User entity, User updateUser) {
		entity.setName(updateUser.getName());
		entity.setEmail(updateUser.getEmail());
		entity.setPhone(updateUser.getPhone());
	}
	
	
	
}