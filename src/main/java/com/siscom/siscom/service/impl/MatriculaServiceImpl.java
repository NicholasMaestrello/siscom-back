package com.siscom.siscom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.siscom.model.adapter.AlunoAdapter;
import com.siscom.siscom.model.adapter.MatriculaAdapter;
import com.siscom.siscom.model.dto.AlunoDTO;
import com.siscom.siscom.model.dto.MatriculaDTO;
import com.siscom.siscom.model.entity.AlunoEntity;
import com.siscom.siscom.model.entity.MatriculaEntity;
import com.siscom.siscom.repository.MatriculaRepository;
import com.siscom.siscom.service.MatriculaService;

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
	public void deletarPorAluno(AlunoDTO aluno) {
		AlunoEntity a = AlunoAdapter.adaptToEntity(aluno);
		matriculaRepo.deleteByAluno(a);
	}

	
}
