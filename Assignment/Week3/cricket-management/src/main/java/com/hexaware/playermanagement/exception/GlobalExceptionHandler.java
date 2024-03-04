package com.hexaware.playermanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	

	@ExceptionHandler({InvalidRoleException.class})
	public ResponseEntity<String> handleExp1(InvalidRoleException e) {
		
		return new ResponseEntity<String>(e.toString(),HttpStatus.NOT_ACCEPTABLE);
	}
	
	
	@ExceptionHandler({PlayerNotFound.class})
	public ResponseEntity<String> handleExp2(PlayerNotFound e) {
		
		return new ResponseEntity<String>(e.toString(),HttpStatus.NOT_ACCEPTABLE);
	}
	
}
