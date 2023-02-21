package com.example.usuarios.infrastructure.output.jpa.entity;

import com.example.usuarios.domain.model.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String firstName;

    @Column(name = "apellido", nullable = false)
    private String lastName;

    @Column(name = "celular")
    private String phone;

    @Column(name = "correo")
    private String mail;

    @Column(name = "clave")
    private String password;

//    private Role role;


}
