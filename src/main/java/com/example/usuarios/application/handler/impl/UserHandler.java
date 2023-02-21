package com.example.usuarios.application.handler.impl;

import com.example.usuarios.application.dto.request.UserRequestDto;
import com.example.usuarios.application.dto.response.UserResponseDto;
import com.example.usuarios.application.handler.IUserHandler;
import com.example.usuarios.application.mapper.IUserRequestMapper;
import com.example.usuarios.application.mapper.IUserResponseMapper;
import com.example.usuarios.domain.api.IUserServicePort;
import com.example.usuarios.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserHandler implements IUserHandler {

    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;
    private final IUserResponseMapper userResponseMapper;

    @Override
    public void saveUser(UserRequestDto userRequestDto) {
        User user = userRequestMapper.toUser(userRequestDto);
        userServicePort.saveUser(user);
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userResponseMapper.toResponseList(userServicePort.getAllUsers());
    }
}
