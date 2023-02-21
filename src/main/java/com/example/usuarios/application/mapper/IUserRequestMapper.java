package com.example.usuarios.application.mapper;

import com.example.usuarios.application.dto.request.UserRequestDto;
import com.example.usuarios.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserRequestMapper {
    User toUser(UserRequestDto userRequestDto);
}
