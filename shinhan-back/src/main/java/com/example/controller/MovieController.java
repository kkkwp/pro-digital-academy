package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "movie controller")
@RestController
@RequestMapping("/api")
public class MovieController {

	@GetMapping("/v1/movies")
	public String get() {
		return "test";
	}

	@GetMapping("/v1/movies/{movieId}")
	public String getMovie(
		@PathVariable(value = "movieId") long movieId,
		@RequestParam(value = "v", required = false) Integer v
	) {
		return String.valueOf(movieId + " " + v);
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
