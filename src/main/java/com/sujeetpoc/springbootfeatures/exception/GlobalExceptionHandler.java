package com.sujeetpoc.springbootfeatures.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.java.Log;

@ControllerAdvice
@Log
public class GlobalExceptionHandler {

	@ExceptionHandler(value = InvalidEmployee.class)
	public ResponseEntity<String> handleInvalidEmployeeException() {
		log.info("Found invalid employee..");
		return new ResponseEntity<>("This is Invalid Employee Record!!", HttpStatus.NOT_FOUND);
	}

}
