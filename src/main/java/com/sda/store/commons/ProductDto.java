package com.sda.store.commons;

public class ProductDto {

    private String name;
    private int count;
    private OrderDto orderEntity;

    public ProductDto(String name, int count, OrderDto orderEntity) {
        this.name = name;
        this.count = count;
        this.orderEntity = orderEntity;
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

    public OrderDto getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderDto orderEntity) {
        this.orderEntity = orderEntity;
    }
}
