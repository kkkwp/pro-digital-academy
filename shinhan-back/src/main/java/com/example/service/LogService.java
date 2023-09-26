package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.entity.Log;
import com.example.repository.LogRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LogService {

	private final LogRepository logRepository;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveLog() {
		logRepository.save(new Log());
	}
}
