package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
