package com.siscom.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Modalidade")
public class ModalidadeEntity implements Serializable {
	private static final long serialVersionUID = -6171365842988014214L;

	@Id
	@Column(name = "ModId")
	private int id;
	
	@Column(name = "ModNome")
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
