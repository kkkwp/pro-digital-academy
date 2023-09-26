package com.example.domain.response;

import java.util.List;

import com.example.domain.entity.Actor;
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
	private final List<String> actorNames;

	public static MovieResponse of(Movie movie) {
		return new MovieResponse(
			movie.getId(),
			movie.getName(),
			movie.getProductionYear(),
			movie.getDirector().getName(),
			movie.getActors().stream()
				.map(Actor::getName)
				.toList()
		);
	}
}
