package com.siscom.model.dto;

import java.io.Serializable;

public class ApiErrorDTO implements Serializable{

	private static final long serialVersionUID = -8591186878602281312L;
	
	private String message;
	private String stackTrace;
	private int valueError;
	
	public ApiErrorDTO(String message, String stackTrace, int value) {
		this.message = message;
		this.valueError = value;
		this.stackTrace = stackTrace;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStack() {
		return stackTrace;
	}

	public void setStack(String stackTrace) {
		this.stackTrace = stackTrace;
	}

	public int getValueError() {
		return valueError;
	}

	public void setValueError(int valueError) {
		this.valueError = valueError;
	}
}
