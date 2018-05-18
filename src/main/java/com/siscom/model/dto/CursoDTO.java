package com.siscom.model.dto;

import java.io.Serializable;

public class CursoDTO implements Serializable {

	private static final long serialVersionUID = -5258928963272086927L;

	private int id;

	private ModalidadeDTO modalidade;

	private String responsavel;

	private Integer quantidadeAlunos;

	private String nivel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ModalidadeDTO getModalidade() {
		return modalidade;
	}

	public void setModalidade(ModalidadeDTO modalidade) {
		this.modalidade = modalidade;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Integer getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(Integer quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	
}
