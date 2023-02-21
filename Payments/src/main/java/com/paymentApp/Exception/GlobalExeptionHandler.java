package com.paymentApp.Exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.paymentApp.Entity.PaymentCards;

@RestControllerAdvice
public class GlobalExeptionHandler {

	
	@ExceptionHandler(CardNumberNotMatch.class)
	public ResponseEntity<?> resourceNotFound(CardNumberNotMatch ex) {
		
		String message=ex.getMessage();
		return new ResponseEntity(Map.of("message","length Does not match"),HttpStatus.LENGTH_REQUIRED);
	}

	@ExceptionHandler(CvvLengthNotMatch.class)
	public ResponseEntity<?> CvvDoesNotMatch(CvvLengthNotMatch ex) {
		
		String message=ex.getMessage();
		return new ResponseEntity(Map.of("message","Cvv length should be 3 to 4 digit"),HttpStatus.LENGTH_REQUIRED);
	}
	@ExceptionHandler(CardAlreadyLinked.class)
	public ResponseEntity<?> CvvDoesNotMatch(CardAlreadyLinked ex) {
		
		String message=ex.getMessage();
		return new ResponseEntity(Map.of("message","Card is Already Linked"),HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(CardAlreadyDeleted.class)
	public ResponseEntity<?> cardAlredyRemoved(CardAlreadyDeleted ex) {
		
		String message=ex.getMessage();
		return new ResponseEntity(Map.of("status","422", "title","Validation","message","Card is not linked to this account"),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
