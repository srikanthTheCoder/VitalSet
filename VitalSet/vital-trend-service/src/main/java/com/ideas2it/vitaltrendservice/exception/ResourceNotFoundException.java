package com.ideas2it.vitaltrendservice.exception;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(Long id) {
		super(String.format("Resource with Id %d not found", id));
	}

}