package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.MyConfig;
import com.example.service.MyService;

@RestController
public class MyController {

	private final MyService myService;
	private final MyConfig myConfig;

	@Autowired
	public MyController(MyService myService, MyConfig myConfig) {
		this.myService = myService;
		this.myConfig = myConfig;
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
