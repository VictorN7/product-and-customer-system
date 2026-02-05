package com.victornogueira.salessystem.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.victornogueira.salessystem.entities.Category;
import com.victornogueira.salessystem.entities.Order;
import com.victornogueira.salessystem.entities.User;
import com.victornogueira.salessystem.entities.enums.OrderStatus;
import com.victornogueira.salessystem.repositories.CategoryRepository;
import com.victornogueira.salessystem.repositories.OrderRepository;
import com.victornogueira.salessystem.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null,"Maria Brown", "maria@hotmail.com", "988345567", "123456789");
		User u2 = new User(null,"João Vitor", "joaovitor@hotmail.com", "912334455", "987654321");
		User u3 = new User(null, "Lucas Henrique", "lucash@gmail.com", "914556677", "234567891");
		User u4 = new User(null, "Ana Paula", "anapaula@yahoo.com", "915667788", "345678912");
		User u5 = new User(null, "Pedro Augusto", "pedroaugusto@gmail.com", "916778899", "456789123");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.WAITING_PAYMENT,  u1);
		Order o2 = new Order(null, Instant.parse("2019-07-15T14:22:10Z"),OrderStatus.WAITING_PAYMENT, u1);
		Order o3 = new Order(null, Instant.parse("2019-08-03T09:45:30Z"),OrderStatus.DELIVERED, u3);
		Order o4 = new Order(null, Instant.parse("2019-09-12T18:10:55Z"),OrderStatus.PAID, u4);
		Order o5 = new Order(null, Instant.parse("2019-10-01T11:05:42Z"),OrderStatus.CANCELED, u5);
		
		Category c1 = new Category(null, "Eletronics");
		Category c2 = new Category(null, "Books");
		Category c3 = new Category(null, "Computers");
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5)); // Instancia uma lista de usuários
		orderRepository.saveAll(Arrays.asList(o1,o2,o3,o4,o5));
		categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
	} 
}