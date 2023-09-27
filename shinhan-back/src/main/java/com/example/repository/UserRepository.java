package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
