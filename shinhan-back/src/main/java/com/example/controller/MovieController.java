package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Movie;
import com.example.domain.request.MovieRequest;
import com.example.service.MovieService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "movie controller")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MovieController {

	private final MovieService movieService;

	@GetMapping("/v1/movies")
	public List<Movie> getMovies() {
		return movieService.getMovies();
	}

	@GetMapping("/v1/movies/{movieId}")
	public Movie getMovie(
		@PathVariable(value = "movieId") long movieId
	) {
		return movieService.getMovie(movieId);
	}

	@PostMapping("/v1/movies")
	public void createMovie(
		@RequestBody MovieRequest movieRequest
	) {
		movieService.createMovie(movieRequest);
	}

	@PutMapping("/v1/movies/{movieId}")
	public void updateMovie(
		@PathVariable(value = "movieId") long movieId,
		@RequestBody MovieRequest movieRequest
	) {
		movieService.updateMovie(movieId, movieRequest);
	}

	@DeleteMapping("/v1/movies/{movieId}")
	public void deleteMovie(
		@PathVariable(value = "movieId") long movieId
	) {
		movieService.deleteMovie(movieId);
	}
}
