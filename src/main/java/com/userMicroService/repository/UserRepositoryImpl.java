package com.userMicroService.repository;

import com.userMicroService.model.UserModel;
import com.userMicroService.mapper.UserMapper;
import com.userMicroService.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String createUser(UserModel userModel) {
        String sql = "INSERT INTO " + Constants.USER_TABLE_NAME + " (first_name, last_name, email, address, join_date) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, userModel.getFirstName(), userModel.getLastName(), userModel.getEmail(), userModel.getAddress(), userModel.getJoinDate());
        return "User was successfully created and added to the system !";
    }

    @Override
    public String updateUserNameById(int userId, String firstName, String lastName) {
        String sql = "UPDATE " + Constants.USER_TABLE_NAME + " SET first_name = ?, last_name = ? WHERE id = ?";

        if (jdbcTemplate.update(sql, firstName, lastName, userId) == 1) {
            return "User's first name with id " + userId + " was updated to first name " + firstName + " and last name " + lastName;
        } else {
            return "User with id " + userId + " wasn't found";
        }
    }

    @Override
    public String deleteUserById(int userId) {
        String sql = "DELETE FROM " + Constants.USER_TABLE_NAME + " WHERE id = ?";
        int rowsAffected = jdbcTemplate.update(sql, userId);

        if (rowsAffected == 1) {
            return "User with id " + userId + " was successfully deleted";
        } else {
            return "User with id " + userId + " was not found";
        }
    }


    @Override
    public UserModel getUserById(int userId) {
        try {
            String sql = "SELECT * FROM " + Constants.USER_TABLE_NAME + " WHERE id = ?";
            return jdbcTemplate.queryForObject(sql, new UserMapper(), userId);
        } catch (EmptyResultDataAccessException e) {

            return null;
        }
    }

}
