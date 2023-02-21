package com.example.usuarios.domain.usecase;

import com.example.usuarios.domain.api.IUserServicePort;
import com.example.usuarios.domain.model.User;
import com.example.usuarios.domain.spi.IUserPersistancePort;

import java.util.List;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistancePort userPersistancePort;

    public UserUseCase(IUserPersistancePort userPersistancePort) {
        this.userPersistancePort = userPersistancePort;
    }

    @Override
    public void saveUser(User user) {
        userPersistancePort.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userPersistancePort.getAllUsers();
    }
}
