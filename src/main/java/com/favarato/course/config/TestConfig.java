package com.favarato.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.favarato.course.entities.Category;
import com.favarato.course.entities.Order;
import com.favarato.course.entities.Product;
import com.favarato.course.entities.User;
import com.favarato.course.entities.enums.OrderStatus;
import com.favarato.course.repositories.CategoryRepository;
import com.favarato.course.repositories.OrderRepository;
import com.favarato.course.repositories.ProductRepository;
import com.favarato.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		Category ca1 = new Category(null, "Electronics");
		Category ca2 = new Category(null, "Fashion");
		Category ca3 = new Category(null, "Education");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "/lord.png");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "/smart.png");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "/macbook.png");
		Product p4 = new Product(null, "Gaming Computer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "/pc.png");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "/railsfordummies.png"); 

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "959203565", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "967864534", "123456");
		User u3 = new User(null, "Roman Lexus", "rlexus@gmail.com", "978656453", "123456");
		User u4 = new User(null, "Thomas Red", "thomas@gmail.com", "987676545", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(ca1, ca2, ca3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
	}
}