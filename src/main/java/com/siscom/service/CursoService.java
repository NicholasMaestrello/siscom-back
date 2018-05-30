package com.siscom.service;

import java.util.List;

import com.siscom.model.dto.CursoDTO;

public interface CursoService {

	List<CursoDTO> listarCursos();
	CursoDTO incluirCurso(CursoDTO curso);
	CursoDTO alterarCurso(CursoDTO curso);
	void excluirCurso(int idCurso);
}
