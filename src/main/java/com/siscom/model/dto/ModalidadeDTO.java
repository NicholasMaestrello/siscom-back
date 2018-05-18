package com.siscom.model.dto;

import java.io.Serializable;

public class ModalidadeDTO implements Serializable {

	private static final long serialVersionUID = 2948770302295979320L;

	private int id;
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
