package com.sda.store.product;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

    List<ProductEntity> findAllByCountGreaterThan(int maxCont);
}
