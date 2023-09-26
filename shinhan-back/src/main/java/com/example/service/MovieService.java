package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;
import com.example.repository.LogRepository;
import com.example.repository.MovieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {

	private final MovieRepository movieRepository;
	private final LogService logService;
	private final LogRepository logRepository;

	@Transactional
	public List<MovieResponse> getMovies() {
		List<Movie> movies = movieRepository.findAll();
		return movies.stream()
			.map(MovieResponse::of)
			.toList();
	}

	@Transactional
	public MovieResponse getMovie(long movieId) {
		Movie movie = movieRepository.findById(movieId)
			.orElseThrow();
		return MovieResponse.of(movie);
	}

	@Transactional
	public void createMovie(MovieRequest movieRequest) {
		Movie movie = new Movie(movieRequest.getName(), movieRequest.getProductionYear());
		movieRepository.save(movie);
		logService.saveLog();
	}

	@Transactional
	public void updateMovie(long movieId, MovieRequest movieRequest) {
		Movie movie = movieRepository.findById(movieId).orElseThrow();
	}

	public void deleteMovie(long movieId) {
	}
}
