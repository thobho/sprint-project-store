package com.sda.store.order;

import com.sda.store.product.Product;
import com.sda.store.user.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    public Order createOrder(User user, List<Product> products){
        return new Order(user, products);
    }
}
