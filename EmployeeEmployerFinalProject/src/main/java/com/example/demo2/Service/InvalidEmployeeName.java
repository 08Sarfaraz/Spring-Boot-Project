package com.example.demo2.Service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_ACCEPTABLE)
public class InvalidEmployeeName extends RuntimeException {

	public InvalidEmployeeName(String string) {
		super(string);
		
	}

}
