package com.rest.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.demo.model.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}