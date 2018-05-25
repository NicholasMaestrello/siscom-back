package com.siscom.exception.type;

public class InvalidArgumentException extends RuntimeException {
	private static final long serialVersionUID = -8947735235250063140L;

	public InvalidArgumentException(String message) {
		super(message);
	}
}
