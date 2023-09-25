package com.example.ioc;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PrintBeans {

	private final ApplicationContext applicationContext;

	@Bean
	public void printBeansMethod() {
		List<String> beans = Arrays.stream(applicationContext.getBeanDefinitionNames()).toList();
		for (String bean : beans) {
			System.out.println(bean);
		}
	}
}
