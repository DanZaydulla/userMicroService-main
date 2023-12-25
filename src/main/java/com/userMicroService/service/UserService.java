package com.userMicroService.service;

import com.userMicroService.model.UserModel;

public interface UserService {

    String createUser(UserModel userModel);
    String deleteUserById(int userId);
    UserModel getUserById(int userId);
    String updateUserNameById(int userId, String firstName, String lastName);
}
