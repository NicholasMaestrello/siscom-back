package com.siscom.siscom.service;

import java.util.List;

import com.siscom.siscom.model.dto.AlunoDTO;

public interface AlunoService {

	List<AlunoDTO> listarAlunos();
	String inserirAluno(AlunoDTO aluno);
	String alterarAluno(AlunoDTO aluno);
}
