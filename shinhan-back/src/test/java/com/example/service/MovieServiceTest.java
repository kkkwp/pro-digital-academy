package com.example.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.domain.response.MovieResponse;

@SpringBootTest
public class MovieServiceTest {

	@Autowired
	MovieService movieService;

	@Test
	@DisplayName("영화 단건조회 테스트")
	void getMovieTest() {
		// given
		int movieId = 3;

		// when
		MovieResponse movie = movieService.getMovie(movieId);

		// then
		assertNotNull(movie);
	}
}
