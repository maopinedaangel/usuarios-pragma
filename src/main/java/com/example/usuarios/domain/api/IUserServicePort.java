package com.example.usuarios.domain.api;

import com.example.usuarios.domain.model.User;

import java.util.List;

public interface IUserServicePort {

    void saveUser(User user);
    List<User> getAllUsers();

}
