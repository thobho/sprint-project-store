package com.sda.store.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity saveUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }


}
