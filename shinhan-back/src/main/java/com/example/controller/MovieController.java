package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Movie;
import com.example.service.MovieService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "movie controller")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MovieController {

	private final MovieService movieService;

	@Deprecated(since = "v2 사용하세요.")
	@GetMapping("/v1/movies")
	public String get() {
		return "test";
	}

	@GetMapping("/v2/movies")
	public List<Movie> getMovies() {
		return List.of(new Movie(1, "오펜하이머", 2023));
	}

	@GetMapping("/v1/movies/{movieId}")
	public Movie getMovie(
		@PathVariable(value = "movieId") long movieId
	) {
		return new Movie(1, "오펜하이머", 2023);
	}

	@PostMapping("/v1/movies")
	public void create() {
	}

	@PutMapping("/v1/movies")
	public void update() {
	}

	@DeleteMapping("/v1/movies")
	public void delete() {
	}
}
