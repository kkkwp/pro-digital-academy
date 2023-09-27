package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.request.UserRequest;
import com.example.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping("/api/v1/user/join")
	public void join(
		@RequestBody UserRequest userRequest
	) {
		userService.join(userRequest);
	}

	@GetMapping("/home")
	public String home() {
		return "어서와^^ 로그인 성공했네~ ㅊㅋㅊㅋ";
	}
}
