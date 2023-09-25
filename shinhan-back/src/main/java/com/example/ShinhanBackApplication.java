package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ioc.Chef;
import com.example.ioc.IngredientFactory;

@SpringBootApplication
public class ShinhanBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShinhanBackApplication.class, args);

		IngredientFactory ingredientFactory = new IngredientFactory();
		Chef chef = new Chef(ingredientFactory);
		String food = chef.cook("치킨");
		System.out.println(food);
	}
}
