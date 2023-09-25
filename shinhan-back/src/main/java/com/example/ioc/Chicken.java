package com.example.ioc;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Chicken implements Ingredient {

	private final String name;
}
