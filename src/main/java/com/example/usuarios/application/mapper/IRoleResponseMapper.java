package com.example.usuarios.application.mapper;

import com.example.usuarios.application.dto.response.RoleResponseDto;
import com.example.usuarios.domain.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleResponseMapper {
    RoleResponseDto toResponse(Role role);
    List<RoleResponseDto> toResponseList(List<Role> roleList);
}
