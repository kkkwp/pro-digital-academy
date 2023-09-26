package com.example.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.domain.entity.Log;
import com.example.repository.LogRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LogService {

	private final LogRepository logRepository;

	@Transactional
	public void saveLog() {
		logRepository.save(new Log());
	}
}
