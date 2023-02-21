package com.example.usuarios.infrastructure.output.jpa.repository;

import com.example.usuarios.infrastructure.output.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
}
