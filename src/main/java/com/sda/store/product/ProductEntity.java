package com.sda.store.product;

import com.sda.store.order.OrderEntity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int count;

    @ManyToOne
    private OrderEntity orderEntity;

    public ProductEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
