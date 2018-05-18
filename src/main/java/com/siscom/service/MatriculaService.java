package com.siscom.service;

import java.util.List;

import com.siscom.model.dto.MatriculaDTO;

public interface MatriculaService {

	List<MatriculaDTO> listarMatriculas();
	void inserirMatriculas(List<MatriculaDTO> matriculas);
	void deletarPorAluno(int id);
}
