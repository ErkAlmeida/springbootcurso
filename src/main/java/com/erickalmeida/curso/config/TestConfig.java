package com.erickalmeida.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.erickalmeida.curso.entities.User;
import com.erickalmeida.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Erick","erickprofissional@gmail.com","11984466670","123456");
		User u2 = new User(null, "Celia","celia@gmail.com","1123445","654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
