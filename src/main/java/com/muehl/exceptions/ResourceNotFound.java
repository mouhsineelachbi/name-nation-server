package com.muehl.exceptions;

public class ResourceNotFound extends RuntimeException {
	/*
	 * Exception for resource not found
	 */
	public ResourceNotFound(String message) {
		super(message);
	}
}
