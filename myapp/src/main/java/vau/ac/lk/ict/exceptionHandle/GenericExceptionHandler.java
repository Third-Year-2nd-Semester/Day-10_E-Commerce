package vau.ac.lk.ict.exceptionHandle;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import vau.ac.lk.ict.model.ErrorResponse;
import jakarta.persistence.EntityNotFoundException;

public class GenericExceptionHandler {
@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleEntityNotFound(EntityNotFoundException exception) {
		ErrorResponse errorResponce = new ErrorResponse(HttpStatus.NOT_FOUND.value(), 
				exception.getMessage());
		return new ResponseEntity<ErrorResponse>(errorResponce, HttpStatus.NOT_FOUND);
	}
}
