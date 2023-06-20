package com.favarato.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.favarato.course.entities.User;
import com.favarato.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "959203674", "maria1123");
		User u2 = new User(null, "Alex Grenn", "alex.com", "986732637", "alexgrenn2004");
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
