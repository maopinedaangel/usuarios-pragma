package com.example.usuarios.infrastructure.output.jpa.adapter;

import com.example.usuarios.domain.model.User;
import com.example.usuarios.domain.spi.IUserPersistancePort;
import com.example.usuarios.infrastructure.exception.NoDataFoundException;
import com.example.usuarios.infrastructure.output.jpa.entity.RoleEntity;
import com.example.usuarios.infrastructure.output.jpa.entity.UserEntity;
import com.example.usuarios.infrastructure.output.jpa.mapper.IUserEntityMapper;
import com.example.usuarios.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistancePort {

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Override
    public User saveUser(User user) {
        UserEntity userEntity = userRepository.save(userEntityMapper.toEntity(user));
        return userEntityMapper.toUser(userEntity);
    }

    @Override
    public List<User> getAllUsers() {
        List<UserEntity> entityList = userRepository.findAll();
        if (entityList.isEmpty()) {
            throw new NoDataFoundException();
        }
        return userEntityMapper.toUserList(userRepository.findAll());
    }
}
