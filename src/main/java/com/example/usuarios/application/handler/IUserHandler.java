package com.example.usuarios.application.handler;

import com.example.usuarios.application.dto.request.UserRequestDto;
import com.example.usuarios.application.dto.response.UserResponseDto;

import java.util.List;

public interface IUserHandler {
    void saveUser(UserRequestDto userRequestDto);
    List<UserResponseDto> getAllUsers();
}
