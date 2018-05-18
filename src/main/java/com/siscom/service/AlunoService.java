package com.siscom.service;

import java.util.List;

import com.siscom.model.dto.AlunoDTO;
import com.siscom.model.dto.DefaultResponseDTO;

public interface AlunoService {

	List<AlunoDTO> listarAlunos();
	DefaultResponseDTO<AlunoDTO> inserirAluno(AlunoDTO aluno);
	String alterarAluno(AlunoDTO aluno);
	String deletarAluno(int id);
}
