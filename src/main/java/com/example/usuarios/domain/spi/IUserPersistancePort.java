package com.example.usuarios.domain.spi;

import com.example.usuarios.domain.model.User;

import java.util.List;

public interface IUserPersistancePort {
    User saveUser(User user);
    List<User> getAllUsers();
}
