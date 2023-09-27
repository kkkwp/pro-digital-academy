package com.example.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.domain.entity.Actor;
import com.example.domain.entity.Director;
import com.example.domain.entity.Movie;
import com.example.domain.request.MovieRequest;
import com.example.domain.response.MovieResponse;
import com.example.repository.MovieRepository;

@ExtendWith(MockitoExtension.class)
public class MovieServiceMockTest {
	@Mock
	private MovieRepository movieRepository;

	@Mock
	private LogService logService;

	@InjectMocks
	private MovieService movieService;

	@Test
	void 영화단건조회_정상조회_테스트() {
		// given
		int movieId = 1;
		Movie movie = new Movie();
		movie.setName("하이");
		movie.setDirector(new Director());
		movie.setActors(List.of(new Actor()));

		// when
		when(movieRepository.findById(anyLong()))
			.thenReturn(Optional.of(movie));

		// then
		MovieResponse result = movieService.getMovie(movieId);
		assertNotNull(result);
	}

	@Test
	void 영화단건조회_조회불가_테스트() {
		// given
		int movieId = 1;
		Movie movie = new Movie();
		movie.setName("하이");
		movie.setDirector(new Director());
		movie.setActors(List.of(new Actor()));

		// when
		when(movieRepository.findById(anyLong()))
			.thenReturn(null);

		// then
		assertThrows(NullPointerException.class,
			() -> movieService.getMovie(movieId));
	}

	@Test
	void 영화단건_저장_테스트() {
		// given
		MovieRequest request = new MovieRequest("영화명", 2002);
		Movie movie = new Movie("영화명", 2002);

		// when
		when(movieRepository.save(any(Movie.class))).thenReturn(movie);
		doNothing().when(logService).saveLog();

		// then
		movieService.createMovie(request);
	}
}
