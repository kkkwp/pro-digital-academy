package com.example.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Movie {

	private final long id;
	private final String name;
	private final Integer productionYear;

}
