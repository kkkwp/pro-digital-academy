package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.domain.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	@Query("select distinct m from Movie m left join fetch m.actors a left join fetch m.director d")
	List<Movie> findAllJpqlFetch();
}
