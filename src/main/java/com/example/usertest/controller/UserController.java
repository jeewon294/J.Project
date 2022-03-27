package com.example.usertest.controller;

import com.example.usertest.dto.UserDTO;
import com.example.usertest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    //CRUD
    // c- post
    // r -get
    // u - put
    // d - delete

    @PostMapping("")
    public UserDTO insertUser(@RequestBody UserDTO user){
        return userService.insertUser(user);
    }

    @GetMapping("")
    public List<UserDTO>getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public UserDTO getUserByUserId(@PathVariable String userId){
        return userService.getUserByUserId(userId);
    }

    @PutMapping("/{userId}")
    public void updateUserPw(@PathVariable String userId,@RequestBody UserDTO user){
        userService.updateUserPw(userId, user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
    }
}
