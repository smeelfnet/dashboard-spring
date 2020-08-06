package com.dashboard.api.repositories;

import com.dashboard.api.models.auth.ERole;
import com.dashboard.api.models.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
