package com.example.usuarios.infrastructure.configuration;

import com.example.usuarios.domain.api.IRoleServicePort;
import com.example.usuarios.domain.api.IUserServicePort;
import com.example.usuarios.domain.spi.IRolePersistancePort;
import com.example.usuarios.domain.spi.IUserPersistancePort;
import com.example.usuarios.domain.usecase.RoleUseCase;
import com.example.usuarios.domain.usecase.UserUseCase;
import com.example.usuarios.infrastructure.output.jpa.adapter.RoleJpaAdapter;
import com.example.usuarios.infrastructure.output.jpa.adapter.UserJpaAdapter;
import com.example.usuarios.infrastructure.output.jpa.mapper.IRoleEntityMapper;
import com.example.usuarios.infrastructure.output.jpa.mapper.IUserEntityMapper;
import com.example.usuarios.infrastructure.output.jpa.repository.IRoleRepository;
import com.example.usuarios.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;
    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Bean
    public IRolePersistancePort rolePersistancePort() {
        return new RoleJpaAdapter(roleRepository, roleEntityMapper);
    }

    @Bean
    public IRoleServicePort roleServicePort() {
        return new RoleUseCase(rolePersistancePort());
    }

    @Bean
    public IUserPersistancePort userPersistancePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IUserServicePort userServicePort() {
        return new UserUseCase((userPersistancePort()));
    }
}
