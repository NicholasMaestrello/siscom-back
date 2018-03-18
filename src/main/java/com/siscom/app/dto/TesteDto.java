package com.siscom.app.dto;

import java.io.Serializable;

public class TesteDto implements Serializable{

	private static final long serialVersionUID = 4443426266625859757L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
