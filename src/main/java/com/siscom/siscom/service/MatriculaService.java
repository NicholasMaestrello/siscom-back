package com.siscom.siscom.service;

import java.util.List;

import com.siscom.siscom.model.dto.AlunoDTO;
import com.siscom.siscom.model.dto.MatriculaDTO;

public interface MatriculaService {

	List<MatriculaDTO> listarMatriculas();
	void inserirMatriculas(List<MatriculaDTO> matriculas);
	void deletarPorAluno(AlunoDTO aluno);
}
