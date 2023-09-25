package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.domain.Movie;
import com.example.domain.request.MovieRequest;

@Service
public class MovieService {

	private static List<Movie> movies = new ArrayList<>();

	@PostConstruct
	public void init() {
		movies.addAll(List.of(
			new Movie(1, "토이 스토리 3", 2010),
			new Movie(2, "인셉션", 2010),
			new Movie(3, "해리 포터와 마법사의 돌", 2001)
		));
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public Movie getMovie(long movieId) {
		return movies.stream()
			.filter(movie -> movie.getId() == movieId)
			.findFirst()
			.orElseThrow();
	}

	public void createMovie(MovieRequest movieRequest) {
		Movie movie = new Movie(
			movies.size() + 1,
			movieRequest.getName(),
			movieRequest.getProductionYear()
		);
		movies.add(movie);
	}

	public void updateMovie(long movieId, MovieRequest movieRequest) {
		Movie movie = getMovie(movieId);
		System.out.println(movie);
		movie.setName(movieRequest.getName());
		movie.setProductionYear(movieRequest.getProductionYear());
	}

	public void deleteMovie(long movieId) {
		Movie movie = getMovie(movieId);
		movies.remove(movie);
	}
}
