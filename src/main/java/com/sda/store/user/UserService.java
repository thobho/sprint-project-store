package com.sda.store.user;

import com.sda.store.commons.UserDto;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;

    public UserService(UserRepository userRepository, ModelMapper modelMapper){
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public void save(UserDto userToSave){
        UserEntity entityToSave = modelMapper.map(userToSave, UserEntity.class);
        userRepository.save(entityToSave);
    }


    public List<UserDto> getAllUsers(){
        Iterable<UserEntity> allUsers = userRepository.findAll();
        return StreamSupport.stream(allUsers.spliterator(), false)
                .map(userEntity -> modelMapper.map(userEntity, UserDto.class))
                .collect(Collectors.toList());
    }
}
