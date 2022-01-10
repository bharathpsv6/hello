package com.example.demo;

import java.util.NoSuchElementException;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MyControllerAdvice {

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<?> handleNoSuchElementException(NoSuchElementException elementException){
		return new ResponseEntity<String>("No value is present in Database,please change your request",HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(NullPointerException.class)
	public String handleNoSuchElementException(Model model) {
		model.addAttribute("ermsg", "Please try again");
		return "error";
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public String handleResourceNotFoundException(Model model) {
		model.addAttribute("ermsg", "No such record is present");
		return "error";
	}
}

