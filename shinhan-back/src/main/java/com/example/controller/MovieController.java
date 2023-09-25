package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "movie controller")
@RestController
public class MovieController {

	@GetMapping("/movies")
	public String get() {
		return "test";
	}

	@GetMapping("/movies/{movieId}")
	public String getMovie(
		@PathVariable(value = "movieId") long movieId
	) {
		return String.valueOf(movieId);
	}

	@PostMapping("/movies")
	public void create() {
	}

	@PutMapping("/movies")
	public void update() {
	}

	@DeleteMapping("/movies")
	public void delete() {
	}
}
