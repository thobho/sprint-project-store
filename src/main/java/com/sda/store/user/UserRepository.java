package com.sda.store.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    List<UserEntity> findAllByNameEquals(String name);

    UserEntity findAllByJoinDateGreaterThan(Date date);

}
