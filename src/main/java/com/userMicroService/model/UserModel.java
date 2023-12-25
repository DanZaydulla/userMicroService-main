package com.userMicroService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;


public class UserModel {
    @JsonProperty("id")
    private int userId;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String email;
    private int age;
    private String address;
    private LocalDate joinDate = LocalDate.now();

    public UserModel(int userId, String firstName, String lastName, String email, int age, String address, LocalDate joinDate) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.address = address;
        this.joinDate = joinDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }
}
