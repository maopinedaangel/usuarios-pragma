package com.example.usuarios.domain.api;

import com.example.usuarios.domain.model.Role;

import java.util.List;

public interface IRoleServicePort {

    void saveRole(Role role);
    List<Role> getAllRoles();
}
