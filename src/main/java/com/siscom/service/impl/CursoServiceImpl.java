package com.siscom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.exception.type.InvalidArgumentException;
import com.siscom.model.adapter.CursoAdapter;
import com.siscom.model.dto.CursoDTO;
import com.siscom.model.entity.CursoEntity;
import com.siscom.repository.CursoRepository;
import com.siscom.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {
	@Autowired
	CursoRepository cursoRepo;

	@Override
	public List<CursoDTO> listarCursos() {
		return CursoAdapter.adaptToDTO(cursoRepo.findAll());
	}

	@Override
	public CursoDTO incluirCurso(CursoDTO curso) {
		if(curso == null)
			throw new InvalidArgumentException("Curso inforamdo com erros");
		CursoEntity cEntity = CursoAdapter.adaptToEntity(curso);
		cEntity = cursoRepo.save(cEntity);
		curso = CursoAdapter.adaptToDTO(cEntity);
		return curso;
	}

	@Override
	public CursoDTO alterarCurso(CursoDTO curso) {
		if(curso == null || curso.getId() == 0)
			throw new InvalidArgumentException("Curso informado para alteração com erros");
		CursoEntity cEntity = CursoAdapter.adaptToEntity(curso);
		cEntity = cursoRepo.save(cEntity);
		curso = CursoAdapter.adaptToDTO(cEntity);
		return curso;
	}

}
