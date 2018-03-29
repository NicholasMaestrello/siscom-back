package com.siscom.siscom.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "Modalidades")
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
