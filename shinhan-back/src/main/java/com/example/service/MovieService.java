package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;
import com.example.repository.MovieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {

	private final MovieRepository movieRepository;
	private final LogService logService;

	public List<MovieResponse> getMovies() {
		return List.of();
	}

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

	public void updateMovie(long movieId, MovieRequest movieRequest) {
	}

	public void deleteMovie(long movieId) {
	}
}
