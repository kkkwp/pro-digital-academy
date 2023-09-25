package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ioc.Chef;

@SpringBootApplication
public class ShinhanBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShinhanBackApplication.class, args);

		Chef chef = new Chef();
		String food = chef.cook("치킨");
		System.out.println(food);
	}
}
