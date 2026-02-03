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
		User u3 = new User(null, "Lucas Henrique", "lucash@gmail.com", "914556677", "234567891");
		User u4 = new User(null, "Ana Paula", "anapaula@yahoo.com", "915667788", "345678912");
		User u5 = new User(null, "Pedro Augusto", "pedroaugusto@gmail.com", "916778899", "456789123");
		User u6 = new User(null, "Juliana Santos", "juliana.santos@hotmail.com", "917889900", "567891234");
		User u7 = new User(null, "Rafael Moreira", "rafael.moreira@gmail.com", "918990011", "678912345");
		User u8 = new User(null, "Camila Rocha", "camilarocha@gmail.com", "919001122", "789123456");
		User u9 = new User(null, "Bruno Almeida", "bruno.almeida@yahoo.com", "911112233", "891234567");
		User u10 = new User(null, "Fernanda Lima", "fernanda.lima@hotmail.com", "912223344", "912345678");
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8,u9,u10)); // Instancia uma lista de usuários
		
	} 
}