package com.example.usuarios.application.dto.request;

import com.example.usuarios.domain.model.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String firstName;
    private String lastName;
    private String phone;
    private String mail;
    private String password;
    private Role role;
}
