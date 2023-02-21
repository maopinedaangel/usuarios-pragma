package com.example.usuarios.application.handler;

import com.example.usuarios.application.dto.request.RoleRequestDto;
import com.example.usuarios.application.dto.response.RoleResponseDto;

import java.util.List;

public interface IRoleHandler {
    void saveRole(RoleRequestDto roleRequestDto);
    List<RoleResponseDto> getAllRoles();
}
