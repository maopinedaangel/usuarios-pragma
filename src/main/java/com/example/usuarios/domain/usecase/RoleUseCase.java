package com.example.usuarios.domain.usecase;

import com.example.usuarios.domain.api.IRoleServicePort;
import com.example.usuarios.domain.model.Role;
import com.example.usuarios.domain.spi.IRolePersistancePort;

import java.util.List;

public class RoleUseCase implements IRoleServicePort {

    private final IRolePersistancePort rolePersistancePort;

    public RoleUseCase(IRolePersistancePort rolePersistancePort) {
        this.rolePersistancePort = rolePersistancePort;
    }

    @Override
    public void saveRole(Role role) {
        rolePersistancePort.saveRol(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return rolePersistancePort.getAllRoles();
    }
}
