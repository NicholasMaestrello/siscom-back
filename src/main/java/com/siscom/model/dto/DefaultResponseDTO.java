package com.siscom.model.dto;

import java.io.Serializable;

public class DefaultResponseDTO <T> implements Serializable {

	private static final long serialVersionUID = -367406365417479502L;

	private String status;
	private T resposta;

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public T getResposta() {
		return resposta;
	}
	public void setResposta(T resposta) {
		this.resposta = resposta;
	}
	
	
}
