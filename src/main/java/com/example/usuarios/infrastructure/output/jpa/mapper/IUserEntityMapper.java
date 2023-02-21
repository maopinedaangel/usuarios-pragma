package com.example.usuarios.infrastructure.output.jpa.mapper;

import com.example.usuarios.domain.model.User;
import com.example.usuarios.infrastructure.output.jpa.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IUserEntityMapper {

    UserEntity toEntity(User user);
    User toUser(UserEntity userEntity);
    List<User> toUserList(List<UserEntity> userEntityList);

}
