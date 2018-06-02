package com.sda.store;

import com.sda.store.order.Order;
import com.sda.store.order.OrderService;
import com.sda.store.product.Product;
import com.sda.store.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreApplicationTests {

	@Autowired
	private OrderService orderService;

	@Test
	public void contextLoads() {
	}




}
