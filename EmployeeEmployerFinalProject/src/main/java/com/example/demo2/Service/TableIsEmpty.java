package com.example.demo2.Service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class TableIsEmpty extends RuntimeException {

	public TableIsEmpty(String message) {
		super(message);
	}
	

}
