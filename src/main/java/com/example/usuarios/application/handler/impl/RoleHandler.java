package com.example.usuarios.application.handler.impl;

import com.example.usuarios.application.dto.request.RoleRequestDto;
import com.example.usuarios.application.dto.response.RoleResponseDto;
import com.example.usuarios.application.handler.IRoleHandler;
import com.example.usuarios.application.mapper.IRoleRequestMapper;
import com.example.usuarios.application.mapper.IRoleResponseMapper;
import com.example.usuarios.domain.api.IRoleServicePort;
import com.example.usuarios.domain.model.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class RoleHandler implements IRoleHandler {

    private final IRoleServicePort roleServicePort;
    private final IRoleRequestMapper roleRequestMapper;
    private final IRoleResponseMapper roleResponseMapper;

    @Override
    public void saveRole(RoleRequestDto roleRequestDto) {
        Role role = roleRequestMapper.toRole(roleRequestDto);
        roleServicePort.saveRole(role);
    }

    @Override
    public List<RoleResponseDto> getAllRoles() {
        return roleResponseMapper.toResponseList(roleServicePort.getAllRoles());
    }
}
