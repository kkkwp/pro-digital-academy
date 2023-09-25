package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.MyConfig;
import com.example.service.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService myService;
	@Autowired
	private MyConfig myConfig;
}
