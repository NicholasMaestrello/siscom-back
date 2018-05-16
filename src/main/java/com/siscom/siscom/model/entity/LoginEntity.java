package com.siscom.siscom.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class LoginEntity implements Serializable {


	private static final long serialVersionUID = -7286501720065696549L;

	@Id
	@Column(name="Login")
	private String id;
	
	@Column(name="Password")
	private String nome;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
