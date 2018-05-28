package com.siscom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.model.adapter.MatriculaAdapter;
import com.siscom.model.dto.MatriculaDTO;
import com.siscom.model.entity.MatriculaEntity;
import com.siscom.repository.MatriculaRepository;
import com.siscom.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService {
	@Autowired
	private MatriculaRepository matriculaRepo;

	@Override
	public List<MatriculaDTO> listarMatriculas() {
		return MatriculaAdapter.adaptToDTO(matriculaRepo.findAll());
	}

	@Override
	public void inserirMatriculas(List<MatriculaDTO> matriculas) {
		List<MatriculaEntity> mat = MatriculaAdapter.adaptToEntity(matriculas);
		matriculaRepo.save(mat);
	}

	
	@Override
	public void deletarPorAluno(int id) {
		matriculaRepo.deleteByAlunoId(id);
	}

	
}
