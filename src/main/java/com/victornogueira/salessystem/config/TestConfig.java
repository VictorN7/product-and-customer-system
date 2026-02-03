package com.victornogueira.salessystem.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.victornogueira.salessystem.entities.User;
import com.victornogueira.salessystem.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null,"Maria Brown", "maria@hotmail.com", "988345567", "123456789");
		User u2 = new User(null,"João Vitor", "joaovitor@hotmail.com", "912334455", "987654321");
		
		userRepository.saveAll(Arrays.asList(u1,u2)); // Instancia uma lista de usuários
		
	} 
	
	
	
	
	
	

}
