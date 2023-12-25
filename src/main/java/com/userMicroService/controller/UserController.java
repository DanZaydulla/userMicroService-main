package com.userMicroService.controller;

import com.userMicroService.model.UserModel;
import com.userMicroService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public String createUser(@RequestBody UserModel userModel) {
        return userService.createUser(userModel);
    }

    @DeleteMapping("/{userId}")
    public String deleteUserById(@PathVariable int userId) {
        return userService.deleteUserById(userId);
    }

    @PutMapping("/update/name")
    public String updateUserNameById(@RequestBody UserModel userModel) {
        if (userModel.getUserId() == 0 || userModel.getFirstName() == null || userModel.getLastName() == null) {
            return "Can't change this user's name";
        } else {
            return userService.updateUserNameById(userModel.getUserId(), userModel.getFirstName(), userModel.getLastName());
        }
    }

    @GetMapping("/{userId}")
    public UserModel getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

}
