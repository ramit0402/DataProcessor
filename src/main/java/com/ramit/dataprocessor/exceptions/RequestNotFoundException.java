package com.ramit.dataprocessor.exceptions;

public class RequestNotFoundException extends RuntimeException {

	public RequestNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public RequestNotFoundException(String message) {
		super(message);
	}

	public RequestNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
