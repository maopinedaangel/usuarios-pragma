package com.example.usuarios.infrastructure.output.jpa.repository;

import com.example.usuarios.infrastructure.output.jpa.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity, Integer> {
}
