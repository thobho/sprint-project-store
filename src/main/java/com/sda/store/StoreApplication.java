package com.sda.store;

import com.sda.store.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.sda.store.user", "com.sda.store.order"})
public class StoreApplication {

	@Autowired
	private UserService userService;



	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(){
		return args -> {
			userService.getAllUsers().forEach(System.out::println);
		};
	}

}
