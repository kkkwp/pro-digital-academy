package com.example.domain.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MovieRequest {

	private final String name;
	private final Integer productionYear;
}
