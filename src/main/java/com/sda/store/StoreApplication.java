package com.sda.store;

import com.sda.store.order.OrderEntity;
import com.sda.store.order.OrderRepository;
import com.sda.store.product.ProductEntity;
import com.sda.store.product.ProductRepository;
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

@SpringBootApplication(scanBasePackages = {"com.sda.store.user", "com.sda.store.order", "com.sda.store.product"})
public class StoreApplication {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	OrderRepository orderRepository;



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

			UserEntity userEntity = new UserEntity();
			userEntity.setName("Seba");
			userEntity.setJoinDate(new Date());

//			UserEntity userEntity2 = new UserEntity();
//			userEntity2.setName("Seba");
//			userEntity2.setJoinDate(new Date());
//
//			UserEntity userEntity3 = new UserEntity();
//			userEntity3.setName("Anrzej");
//			userEntity3.setJoinDate(new Date());


			OrderEntity orderEntity = new OrderEntity();
			orderEntity.setUserEntity(userEntity);

			ProductEntity productEntity = new ProductEntity();
			productEntity.setCount(2);
			productEntity.setName("Mleko");
			productEntity.setOrderEntity(orderEntity);

			ProductEntity productEntity2 = new ProductEntity();
			productEntity2.setCount(5);
			productEntity2.setName("Masło");
			productEntity2.setOrderEntity(orderEntity);

//			userRepository.save(orderEntity);
//			userRepository.save(userEntity3);
			userRepository.save(userEntity);
			orderRepository.save(orderEntity);
			productRepository.save(productEntity);
			productRepository.save(productEntity2);

			List<UserEntity> seby = userRepository.findAllByNameEquals("Seba");

			seby.stream().forEach(System.out::println);




		};
	}

}
