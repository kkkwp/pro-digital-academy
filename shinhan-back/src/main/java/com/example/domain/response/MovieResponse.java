package com.example.domain.response;

import com.example.domain.entity.Movie;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class MovieResponse {

	private final long id;
	private final String name;
	private final Integer productionYear;
	private final String directorName;

	public static MovieResponse of(Movie movie) {
		return new MovieResponse(
			movie.getId(),
			movie.getName(),
			movie.getProductionYear(),
			movie.getDirector().getName()
		);
	}
}
