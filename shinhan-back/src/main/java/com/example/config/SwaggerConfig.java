package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI swagger() {
		Info info = new Info();
		info.title("spring boot lecture api")
			.version("1.0.0")
			.description("안녕~!");

		return new OpenAPI().info(info);
	}
}
