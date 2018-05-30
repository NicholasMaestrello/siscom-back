package com.siscom.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.exception.type.InvalidArgumentException;
import com.siscom.model.adapter.CursoAdapter;
import com.siscom.model.dto.CursoDTO;
import com.siscom.model.entity.CursoEntity;
import com.siscom.model.entity.MatriculaEntity;
import com.siscom.repository.CursoRepository;
import com.siscom.service.CursoService;
import com.siscom.service.MatriculaService;

@Service
public class CursoServiceImpl implements CursoService {
	@Autowired
	CursoRepository cursoRepo;
	
	@Autowired
	MatriculaService matriculaService;

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

	@Override
	@Transactional
	public void excluirCurso(int idCurso) {
		if(idCurso == 0)
			throw new InvalidArgumentException("Informe um id de aluno");
		CursoEntity c = cursoRepo.findOne(idCurso);
		excluirMatriculas(c);
		cursoRepo.deleteById(c.getId());
	}
	
	private void excluirMatriculas(CursoEntity c) {
		for (MatriculaEntity m : c.getAlunos()) {
			matriculaService.deletarPorCurso(m.getId());
		}
	}

}
