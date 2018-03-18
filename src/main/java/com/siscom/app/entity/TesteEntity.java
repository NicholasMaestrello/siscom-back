package com.siscom.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "test")
@Entity
public class TesteEntity implements Serializable {

	private static final long serialVersionUID = -5952536283867962670L;
	
	@Id
	@Column(name = "nome")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
