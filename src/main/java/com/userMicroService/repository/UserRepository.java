package com.userMicroService.repository;

import com.userMicroService.model.UserModel;

public interface UserRepository {

    String createUser(UserModel userModel);
    String updateUserNameById(int userId, String firstName, String lastName);
    String deleteUserById(int userId);
    UserModel getUserById(int userId);
}
