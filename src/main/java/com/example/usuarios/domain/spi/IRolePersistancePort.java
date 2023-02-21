package com.example.usuarios.domain.spi;

import com.example.usuarios.domain.model.Role;

import java.util.List;

public interface IRolePersistancePort {
    Role saveRol(Role role);
    List<Role> getAllRoles();
}
