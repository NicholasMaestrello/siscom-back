package com.siscom.service;

import java.util.List;

import com.siscom.model.dto.AlunoDTO;
import com.siscom.model.dto.DefaultResponseDTO;

public interface AlunoService {

	List<AlunoDTO> listarAlunos();
	AlunoDTO inserirAluno(AlunoDTO aluno);
	AlunoDTO alterarAluno(AlunoDTO aluno);
	DefaultResponseDTO<String> deletarAluno(int id);
}
