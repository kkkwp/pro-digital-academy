package com.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.stereotype.Service;

import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {

	private final EntityManagerFactory emf;

	public List<MovieResponse> getMovies() {
		return List.of();
	}

	public MovieResponse getMovie(long movieId) {
		EntityManager em = emf.createEntityManager();
		Movie movie = em.find(Movie.class, movieId);
		return MovieResponse.of(movie);
	}

	public void createMovie(MovieRequest movieRequest) {
		EntityManager em = emf.createEntityManager();
		Movie movie = new Movie(movieRequest.getName(), movieRequest.getProductionYear());
		em.persist(movie);
		em.flush();
	}

	public void updateMovie(long movieId, MovieRequest movieRequest) {
	}

	public void deleteMovie(long movieId) {
	}
}
