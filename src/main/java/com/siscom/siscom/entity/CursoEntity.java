package com.siscom.siscom.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Curso")
public class CursoEntity implements Serializable{

	private static final long serialVersionUID = 8252942329378610867L;

	@Id
	@Column(name="CurId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ModId")
	private ModalidadeEntity modalidade;
	
	@Column(name= "CurResp")
	private String responsavel;
	
	@Column(name= "CurQtdeAlu")
	private Integer quantidadeAlunos;

	@Column(name= "CurNivel")
	private String nivel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ModalidadeEntity getModalidadeId() {
		return modalidade;
	}

	public void setModalidadeId(ModalidadeEntity modalidade) {
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
