package com.siscom.model.dto;

import java.io.Serializable;

import com.siscom.model.type.Status;

public class DefaultResponseDTO <T> implements Serializable {

	private static final long serialVersionUID = -367406365417479502L;

	private Status status;
	private T data;

	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}	
}
