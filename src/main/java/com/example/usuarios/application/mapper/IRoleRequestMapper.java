package com.example.usuarios.application.mapper;

import com.example.usuarios.application.dto.request.RoleRequestDto;
import com.example.usuarios.domain.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleRequestMapper {
    Role toRole(RoleRequestDto roleRequestDto);
}
