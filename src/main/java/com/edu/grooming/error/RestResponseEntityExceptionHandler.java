package com.edu.grooming.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.edu.grooming.dao.ErrorMessage;


@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler {
	
	@ExceptionHandler(GlobalException.class)
	public ResponseEntity<ErrorMessage> alreadyExistException(GlobalException exception,WebRequest request) {
		ErrorMessage message = new ErrorMessage(HttpStatus.BAD_REQUEST,exception.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
	}
	

}
