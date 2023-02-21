package com.example.usuarios.infrastructure.output.jpa.mapper;

import com.example.usuarios.domain.model.Role;
import com.example.usuarios.infrastructure.output.jpa.entity.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IRoleEntityMapper {
    RoleEntity toEntity(Role role);
    Role toRole(RoleEntity roleEntity);
    List<Role> toRoleList(List<RoleEntity> roleEntityList);
}
