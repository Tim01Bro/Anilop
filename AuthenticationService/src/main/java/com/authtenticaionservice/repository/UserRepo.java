package com.authtenticaionservice.repository;

import com.authtenticaionservice.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser,Long> {
    AppUser findByUsername(String username);
}
