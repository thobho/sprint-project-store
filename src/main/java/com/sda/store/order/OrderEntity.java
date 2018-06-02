package com.sda.store.order;

import com.sda.store.product.ProductEntity;
import com.sda.store.user.UserEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_user")
    private UserEntity userEntity;

    @OneToMany(mappedBy="orderEntity", fetch = FetchType.EAGER)
    private List<ProductEntity> productEntities;

    private Date orderDate;

    public OrderEntity() {
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "userEntity=" + userEntity +
                ", productEntities=" + productEntities +
                '}';
    }
}
