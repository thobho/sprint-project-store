package com.sda.store;

import com.sda.store.commons.ProductDto;
import com.sda.store.commons.UserDto;
import com.sda.store.order.OrderEntity;
import com.sda.store.order.OrderRepository;
import com.sda.store.product.ProductEntity;
import com.sda.store.product.ProductRepository;
import com.sda.store.product.ProductService;
import com.sda.store.user.UserEntity;
import com.sda.store.user.UserRepository;
import com.sda.store.user.UserService;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.ModelMap;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.sda.store.user", "com.sda.store.order", "com.sda.store.product"}, scanBasePackageClasses = SecurityConfig.class)
public class StoreApplication {

	@Autowired
	private UserService userService;

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Bean
	public ModelMapper mapper(){
		return new ModelMapper();
	}

	@Bean
	public CommandLineRunner run(){
		return args -> {


			UserDto user1 = new UserDto(null, "Seba", new Date());
			UserDto user2 = new UserDto(null, "Andrzej", new Date());
			UserDto user3 = new UserDto(null, "Michał", new Date());

			ProductDto productDto = new ProductDto("Maslo", 2, null);
			ProductDto productDto2 = new ProductDto("Margaryna", 4, null);
			ProductDto productDto3 = new ProductDto("Piwo", 5, null);

			productService.save(productDto);
			productService.save(productDto2);
			productService.save(productDto3);

			userService.save(user1);
			userService.save(user2);
			userService.save(user3);

			userService.getAllUsers().stream().forEach(System.out::println);

		};
	}

}
