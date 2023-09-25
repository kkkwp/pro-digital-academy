package com.example.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MovieRequest {

	private String name;
	private Integer productionYear;
}
