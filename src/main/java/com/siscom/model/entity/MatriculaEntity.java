package com.siscom.model.entity;

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
@Table(name="Matricula")
public class MatriculaEntity implements Serializable {
	private static final long serialVersionUID = -2345819590440432724L;

	@Id
	@Column(name="MatId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="AluId")
	private AlunoEntity aluno;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CurId")
	private CursoEntity curso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AlunoEntity getAluno() {
		return aluno;
	}

	public void setAluno(AlunoEntity aluno) {
		this.aluno = aluno;
	}

	public CursoEntity getCurso() {
		return curso;
	}

	public void setCurso(CursoEntity curso) {
		this.curso = curso;
	}
	
	
}
