package com.example.dansmultipro.repository;

import com.example.dansmultipro.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AppUserRepository extends JpaRepository<AppUser, UUID> {
    Optional<AppUser> findAppUserByUsername(String username);
}
