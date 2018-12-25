package com.rest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.demo.model.UserRegistration;

public interface RegistrationRepository extends JpaRepository<UserRegistration, Integer>{

}
