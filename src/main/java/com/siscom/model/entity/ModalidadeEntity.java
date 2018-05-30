package com.siscom.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "Modalidade")
public class ModalidadeEntity implements Serializable {
	private static final long serialVersionUID = -6171365842988014214L;

	@Id
	@Column(name = "ModId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "ModNome")
	private String nome;
	
	@OneToMany(mappedBy="modalidade", targetEntity= CursoEntity.class, fetch = FetchType.EAGER)
	private List<CursoEntity> cursos;

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

	public List<CursoEntity> getCursos() {
		return cursos;
	}

	public void setCursos(List<CursoEntity> cursos) {
		this.cursos = cursos;
	}
}
