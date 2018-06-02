package com.sda.store.commons;

import com.sda.store.order.OrderEntity;

import java.util.Date;
import java.util.List;

public class UserDto {

    private List<OrderDto> orders;
    private String name;
    private Date joinDate;

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public UserDto(List<OrderDto> orders, String name, Date joinDate) {
        this.orders = orders;
        this.name = name;
        this.joinDate = joinDate;
    }

    public UserDto() {
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "orders=" + orders +
                ", name='" + name + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
