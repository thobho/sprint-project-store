package com.sda.store.commons;

import java.util.List;

public class OrderDto {
    private UserDto userEntity;
    private List<ProductDto> productEntities;

    public OrderDto(UserDto userEntity, List<ProductDto> productEntities) {
        this.userEntity = userEntity;
        this.productEntities = productEntities;
    }

    public UserDto getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserDto userEntity) {
        this.userEntity = userEntity;
    }

    public List<ProductDto> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductDto> productEntities) {
        this.productEntities = productEntities;
    }
}
