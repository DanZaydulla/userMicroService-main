package com.userMicroService.service;

import com.userMicroService.model.UserModel;
import com.userMicroService.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoryImpl customerRepository;

    @Override
    public String createUser(UserModel userModel) {
        return customerRepository.createUser(userModel);
    }

    @Override
    public String updateUserNameById(int userId, String firstName, String lastName) {
        return customerRepository.updateUserNameById(userId, firstName, lastName);
    }

    @Override
    public String deleteUserById(int userId) {
        return customerRepository.deleteUserById(userId);

    }

    @Override
    public UserModel getUserById(int userId) {
        return customerRepository.getUserById(userId);
    }


}
