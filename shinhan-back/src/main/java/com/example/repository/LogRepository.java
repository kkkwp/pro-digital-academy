package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.entity.Log;

public interface LogRepository extends JpaRepository<Log, Long> {
}
