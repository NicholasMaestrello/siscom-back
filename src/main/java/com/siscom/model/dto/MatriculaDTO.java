package com.siscom.siscom.model.dto;

import java.io.Serializable;

public class MatriculaDTO implements Serializable {
	private static final long serialVersionUID = -2924657713029422981L;

	private int id;
	private AlunoDTO aluno;
	private CursoDTO curso;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AlunoDTO getAluno() {
		return aluno;
	}
	public void setAluno(AlunoDTO aluno) {
		this.aluno = aluno;
	}
	public CursoDTO getCurso() {
		return curso;
	}
	public void setCurso(CursoDTO curso) {
		this.curso = curso;
	}
	
	

}
