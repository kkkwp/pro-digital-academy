package com.example.domain.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Movie {

	private long id;
	private String name;
	private Integer productionYear;
	private LocalDateTime createAt;
}
