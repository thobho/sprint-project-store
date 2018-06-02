package com.sda.store.order;

import com.sda.store.product.ProductEntity;
import com.sda.store.user.UserEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private UserEntity userEntity;

//    @Column(name = "product_id")
    @OneToMany(mappedBy="orderEntity", fetch = FetchType.LAZY)
    private List<ProductEntity> productEntities;

    public OrderEntity() {
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
