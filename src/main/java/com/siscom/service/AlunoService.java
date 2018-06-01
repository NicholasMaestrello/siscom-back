package com.siscom.service;

import java.util.List;

import com.siscom.model.dto.AlunoDTO;

public interface AlunoService {

	List<AlunoDTO> listarAlunos();
	AlunoDTO inserirAluno(AlunoDTO aluno);
	AlunoDTO alterarAluno(AlunoDTO aluno);
	void deletarAluno(int id);
}
