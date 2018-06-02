package com.sda.store.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

    static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("Janusz", new Date()));
        userList.add(new User("Krystyna", new Date()));
        userList.add(new User("Mirek", new Date()));
    }

    public List<User> getAllUsers(){
        return userList;
    }

}
