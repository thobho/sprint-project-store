package com.sda.store.user;

import com.sda.store.commons.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getAllUsers(Model model){
        List<UserDto> allUsers = userService.getAllUsers();
        model.addAttribute("allUsers", allUsers);
        return "userlist";
    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute UserDto userDto){
        userDto.setJoinDate(new Date());
        userService.save(userDto);
        return "usersaveresult";
    }

//    @GetMapping("/adduser")
//    public String addUser(Model model){
//        UserDto userToInsert = new UserDto();
//        model.addAttribute("userToInsert", userToInsert);
//        return "userform";
//    }

    @GetMapping("/adduser")
    public ModelAndView addUser(Model model){
        return new ModelAndView("userform", "userToInsert", new UserDto());
    }

}
