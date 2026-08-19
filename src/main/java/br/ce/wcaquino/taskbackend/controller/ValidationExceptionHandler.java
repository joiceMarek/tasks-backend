package br.ce.wcaquino.taskbackend.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.ce.wcaquino.taskbackend.utils.ValidationException;

@RestControllerAdvice
public class ValidationExceptionHandler {

	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<Map<String, String>> handle(ValidationException e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", e.getMessage()));
	}
}
