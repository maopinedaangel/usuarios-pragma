package com.example.usuarios.infrastructure.output.jpa.adapter;

import com.example.usuarios.domain.model.Role;
import com.example.usuarios.domain.spi.IRolePersistancePort;
import com.example.usuarios.infrastructure.exception.NoDataFoundException;
import com.example.usuarios.infrastructure.output.jpa.entity.RoleEntity;
import com.example.usuarios.infrastructure.output.jpa.mapper.IRoleEntityMapper;
import com.example.usuarios.infrastructure.output.jpa.repository.IRoleRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RoleJpaAdapter implements IRolePersistancePort {

    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;

    @Override
    public Role saveRol(Role role) {
        RoleEntity roleEntity = roleRepository.save(roleEntityMapper.toEntity(role));
        return roleEntityMapper.toRole(roleEntity);
    }

    @Override
    public List<Role> getAllRoles() {
        List<RoleEntity> entityList = roleRepository.findAll();
        if (entityList.isEmpty()) {
            throw new NoDataFoundException();
        }
        return roleEntityMapper.toRoleList(entityList);
    }
}
